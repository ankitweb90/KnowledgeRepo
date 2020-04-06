package ExamplesMapReduce;

import java.util.*;
import java.util.function.Predicate;

public class TestMapReduce {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee("Ankit", 50000, 28));
		list.add(new Employee("sam", 50000, 58));
		list.add(new Employee("joe", 50000, 38));
		list.add(new Employee("sophie", 50000, 28));
		list.add(new Employee("natasha", 50000, 48));

		//calculate average age
		
		double average = list.stream().mapToInt(p-> p.getAge())
                .average()
                .getAsDouble();
		
		System.out.println(average);
		
		
		// IntSummaryStatistics object having count, sum, max, min, average values
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

		IntSummaryStatistics newone = primes.stream().mapToInt(x->x).summaryStatistics();
		
		System.out.println(newone.getMax());
		
		Predicate<String> startsWithJ = (n) -> n.startsWith("J"); 
		Predicate<String> fourLetterLong = (n) -> n.length() == 4;
		
		List<Integer> cost = new LinkedList<>(Arrays.asList(10,20,40,30,60,70,80));
		
		System.out.println("starts now");
		cost.stream().map(p->p+0.12*p).forEach(System.out::println);
		
		

	}

}
