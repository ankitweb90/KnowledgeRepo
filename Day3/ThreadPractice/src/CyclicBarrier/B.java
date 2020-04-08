package CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class B extends Thread{
	CyclicBarrier cb;
	
	
	public B(CyclicBarrier cb) {
		super();
		this.cb = cb;
	}


	public void run() {
		try {
			cb.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Begins B...");
	}
}
