package ParkingLot;

public class Bike extends Vehicle{

	public Bike() {
		super();
		
	}

	public Bike(String license, String color, String size) {
		super(license, color, size);
		
	}


	public void printDetailsBike(){
		super.printDetails();
		System.out.println("This is Bike class method");
	}
	
	
}
