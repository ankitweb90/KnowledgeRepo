package examples;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class myTask implements Callable<Integer>{

	int a;
	int b;
	
	public myTask(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public Integer call() throws Exception {
		Integer result = a+b;
		return result;
	}
}


public class CallableFuture {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		int x = 10;
		int y = 20;
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		

		Future<Integer> future = executor.submit(new myTask(x,y));
		
		int result = future.get();
	
		System.out.println("result=" + result);
	}

}
