package CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class A extends Thread{
	CyclicBarrier cb;
	
	public A(CyclicBarrier cb) {
		super();
		this.cb = cb;
	}

	public void run() {
		try {
			cb.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Begins A...");
	}
}