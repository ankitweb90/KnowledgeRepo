package test;

import java.util.stream.IntStream;

public class ImperativeDeclarativeProgramming {

	public static void main(String[] args) {
	
		int sum = 0;
		for(int i=0; i<=100; i++) {
			
			sum +=i;
			
		}
		System.out.println("sum - " + sum);
		
		
		int sum1 = IntStream.rangeClosed(0,100)
					.sum();
		
		System.out.println("Sum new - " + sum1);
		

	}
	
}
