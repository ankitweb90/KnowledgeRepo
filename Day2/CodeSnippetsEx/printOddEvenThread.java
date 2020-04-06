package AallSolutions;

public class printOddEvenThread implements Runnable{
	
	private boolean isEven;
	Object lock;		
	
	public printOddEvenThread(boolean isEven, Object lock) {
		super();
		this.isEven = isEven;
		this.lock = lock;
	}
	
	public static void main(String[] args) {
		Object lock = new Object();
		
		Thread T1 = new Thread(new printOddEvenThread(true, lock));
		Thread T2 = new Thread(new printOddEvenThread(false, lock));
		
		T1.start();
		T2.start();

	}

	@Override
	public void run() {
		if(isEven){
			printEven();
		}else{
			printOdd();
		}
		
	}

	private void printOdd() {
		
		synchronized(lock){
			lock.notify();
			for(int i = 1;i<100;){
				i = i+2;
				try {
					lock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				lock.notify();
				System.out.println(Thread.currentThread().getName() +" "+ i);
			}
				
		}
		
	}

	private void printEven() {
		
		synchronized(lock){
			lock.notify();
			for(int i = 0;i<100;){
				i=i+2;
				try {
					lock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				lock.notify();
				System.out.println(Thread.currentThread().getName() +" "+ i);
			}
			
		}
		
	}

}
