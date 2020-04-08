package ParkingLot;

public class Car extends Vehicle{

	public Car() {
		super();
	}

	public Car(String license, String color, String size) {
		super(license, color, size);
		
	}
	
	
	
	public void printDetailsCar(){
		super.printDetails();
		System.out.println("This is Car method");
		
	}

}
