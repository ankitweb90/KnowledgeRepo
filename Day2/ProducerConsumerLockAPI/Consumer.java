package ProducerConsumerLockAPI;

public class Consumer extends Thread{
	
	ProducerConsumerImpl pc;

	public Consumer(ProducerConsumerImpl obj) {
		super();
		this.pc = obj;
	}
	
	@Override
	public void run() {
		
		try {
			pc.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
		

}
