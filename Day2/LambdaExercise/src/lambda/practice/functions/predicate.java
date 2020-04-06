package lambda.practice.functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class predicate {

	public static void main(String[] args) {
	
		List<Car> cars = Arrays.asList(
				new Car("ford","mustang","maroon",50000),
				new Car("honda","accord","red",40000),
				new Car("fiat","abc","white",30000),
				new Car("lincoln","bcd","maroon",10000),
				new Car("kia","lkj","white",70000)
                );
		
		printCars(cars, (c) -> c.getPrice() >= 10000 && c.getPrice() <= 30000);    // using functional interface with  
		printCars(cars, (c) -> c.getColor().equalsIgnoreCase("white")); 
	}
	
	public static void printCars(List<Car> cars, Predicate<Car> predicate) {
		
		for(Car car: cars) {
			if(predicate.test(car)) {
				car.printCar();
			  }
			}
	}

}
