package CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierEx {

	public static void main(String[] args) {
		
		CyclicBarrier cb = new CyclicBarrier(2); // if awaits calls 2 times, then proceed. used to call both threads parallel
		A a1 = new A(cb);
		B b1 = new B(cb);
		
		a1.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		b1.start();
		

	}

}
