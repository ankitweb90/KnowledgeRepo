package ThreadLocal;

public class app {

	public static void main(String[] args) {
		
		String request1 = "a";
		String request2 = "b";
		
		
		new WorkerThread(request1).start();
		new WorkerThread(request2).start();

	}

}

class WorkerThread extends Thread {
	
    String request;
    Framework framework = new Framework();
	
    public WorkerThread(String request) {
	this.request = request;
    }
	
    @Override 
    public void run() {
	framework.delegate(request);
    }
}

class Framework {
	 
    API api = new API();
	
    public void delegate(String request) {
	preProcess(request);
	try {
	    api.process(request);
	} finally {
	    postProcess();
	}
    }
 
    private void preProcess(String request) {
	String userName = getUserName(request);
	UserContext.setUsername(userName);
    }
	
    private void postProcess() {
	UserContext.clear();
    }
 
    private String getUserName(String request) {
	return request;
    }
}

class API {
	
    Service1 service1 = new Service1();
    Service2 service2 = new Service2();
	
    public void process(String request) {
	service1.doService1();
	sleep();
	service2.doService2();
    }
 
    private void sleep() {
	try { 
	    Thread.sleep(3000); 
	} catch(InterruptedException e) {}
    }
}
 
class Service1 {
	
    public void doService1() {
	System.out.println(
	    "Performing service1 for user - " 
	    + UserContext.getUsername() 
	    + " "  + Thread.currentThread());
    }
}
 
class Service2 {
	
    public void doService2() {
	System.out.println(
	    "Performing service2 for user - " 
	    + UserContext.getUsername() 
	    + " "  + Thread.currentThread());
    }
}
