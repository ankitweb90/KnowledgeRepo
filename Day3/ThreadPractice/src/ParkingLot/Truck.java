package ParkingLot;

public class Truck extends Vehicle{

	public Truck() {
		super();
	
	}

	public Truck(String license, String color, String size) {
		super(license, color, size);
	
	}
	
	
	public void printDetailsTruck(){
		super.printDetails();
		System.out.println("This is Truck class method");
	}

	
}
