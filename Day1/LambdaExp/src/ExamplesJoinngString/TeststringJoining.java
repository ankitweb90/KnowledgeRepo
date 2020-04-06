package ExamplesJoinngString;

import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeststringJoining {

	public static void main(String[] args) {
		
		// StringJoiner method join the strings with a user provided delimiter
		
		String joined = new StringJoiner(", ").add("Ankit").add("Mehra").add("Natasha").toString();
		System.out.println(joined);
		
		//Java8 has added method join() in string class to concat strings
		
		String concat = String.join(", ", "ankit","mehra");
		System.out.println(concat);
		
		String name = "ankit mehra";
		//
		
		String reversal = Stream.of(name).map(rev->new StringBuilder(rev).reverse())
							.collect(Collectors.joining());
		
		System.out.println(reversal);
	}

}
