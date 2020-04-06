package ExamplesForEach;

import java.util.ArrayList;
import java.util.*;

public class TestForEach {

	public static void main(String[] args) {

		//Iterating through list
		List<String> list = new ArrayList<>(Arrays.asList("ankit","sam","jacob","natasha","sophie", "harry"));
		
		list.forEach(elements -> System.out.println(elements));
		//or, only if parameters aren't changing, this is known as method reference
		list.forEach(System.out::println);
	
		//forEach with filters and stream
		list.stream()
		.filter(elements -> elements.startsWith("a"))
		.forEach(System.out::println);
		
		list.stream()
		.filter(elements-> elements.length()>3)
		.forEach(System.out::println);
		
		//using map reduce functions
		
				list.stream()
				.mapToInt(elements -> elements.length())
				.forEach(System.out::println);
	}

}
