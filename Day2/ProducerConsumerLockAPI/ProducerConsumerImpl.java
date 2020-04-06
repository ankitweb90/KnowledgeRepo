package ProducerConsumerLockAPI;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerImpl {
	
	static final int capacity = 10;
	final Queue queue = new LinkedList<>();
	final Random random = new Random();
	
	//lock and condition variables
	final Lock alock = new ReentrantLock();
	final Condition bufferNotFull = alock.newCondition();
	final Condition bufferNotEmpty = alock.newCondition();
	
	public void put() throws InterruptedException {
		
		alock.lock();
		
		while(queue.size() == capacity) {
			System.out.println("Buffer is full " + Thread.currentThread().getName());
			
			bufferNotEmpty.await();
		}
		 
		int number = random.nextInt();
		
		boolean isAdded = queue.offer(number);
		
		if(isAdded) {
			System.out.printf("%s added %d into queue %n ", Thread.currentThread().getName(),number);
			
			//signal consumer thread that buffer has some values now
			System.out.println(Thread.currentThread().getName() + "Signalling that buffer has some value now");
			bufferNotFull.signalAll();
		}
		
		alock.unlock();
	}
	
	
	
	public void get() throws InterruptedException {
		
		
		alock.lock();
		
		while(queue.size() == 0) {
			System.out.println("Buffer is empty " + Thread.currentThread().getName());
			
			bufferNotFull.await();
		}
		 
		Integer value = (Integer) queue.poll();
		
		if(value != null) {
			System.out.printf("%s consumed %d from queue %n ", Thread.currentThread().getName(),value);
			
			//signal consumer thread that buffer has some values now
			System.out.println(Thread.currentThread().getName() + "Signalling that buffer maybe empty now");
			bufferNotFull.signalAll();
		}
		
		alock.unlock();
		
	}
	
	
}
