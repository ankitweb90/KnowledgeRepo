package ProducerConsumerLockAPI;

public class Producer extends Thread{
	
	ProducerConsumerImpl pc;

	public Producer(ProducerConsumerImpl obj) {
	
		super();
		this.pc = obj;
	}
	
	@Override
	public void run() {
		
		try {
			pc.put();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
