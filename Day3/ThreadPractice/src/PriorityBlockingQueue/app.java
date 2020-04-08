package PriorityBlockingQueue;

import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;

public class app {

	public static void main(String[] args) {
		
		PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<Integer>();
		queue.add(10);
		queue.add(50);
		queue.add(30);
		queue.add(80);
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		PriorityBlockingQueue<Student> queue1 = 
				new PriorityBlockingQueue<Student>(5, new StudentComparator());
		 
			queue1.add(new Student("a", 10));
			queue1.add(new Student("b", 7));
			queue1.add(new Student("c", 9));
				
			System.out.println(queue1.poll());
			System.out.println(queue1.poll());
			System.out.println(queue1.poll());
	
	}

}


class StudentComparator implements Comparator<Student> {
	
    @Override
    public int compare(Student o1, Student o2) {
	return o1.getRank() - o2.getRank();
    }
}