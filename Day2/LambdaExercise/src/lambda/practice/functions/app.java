package lambda.practice.functions;

import java.util.*;

public class app {

	public static void main(String[] args) {

		
		List<Car> cars = Arrays.asList(
				new Car("ford","mustang","maroon",50000),
				new Car("honda","accord","red",40000),
				new Car("fiat","abc","white",30000),
				new Car("lincoln","bcd","maroon",10000),
				new Car("kia","lkj","white",70000)
                );
		
		printCarPricerange(cars, 30000, 10000);				// separate methods with 
		printCarByColor(cars, "maroon");				    // specific conditions
		
		
		printCars(cars, new CarCondition() { 					// one method with functional interface having dynamic conditions
																// according to the client
			public boolean test(Car c) {
				
				return c.getPrice() >= 10000 && c.getPrice() <= 30000;
 			} 
			
		});
		
		printCars(cars, (c) -> c.getPrice() >= 10000 && c.getPrice() <= 30000);    // using functional interface with  
		printCars(cars, (c) -> c.getColor().equalsIgnoreCase("white"));            // 	lambda expression
	}
	
	
	
	
	
	public static void printCarPricerange(List<Car> cars, int high, int low) {
		for(Car car: cars) {
			
			if(low <= car.getPrice() && car.getPrice() <= high) {
				car.printCar();
			}	
		}
	}

	
	public static void printCarByColor(List<Car> cars, String color) {
		
		for(Car car: cars) {
			
			if(car.getColor().equalsIgnoreCase(color)) {
				car.printCar();
			}
		}
		
		
	}
	
	
	
	
	public static void printCars(List<Car> cars, CarCondition condition) {
		
		for(Car car: cars) {
			if(condition.test(car)) {
				car.printCar();
			  }
			}
	}
}
