package ParkingLot;

public class Vehicle {

	private String license;
	private String color;
	private String size;
	
	
	public Vehicle() {
		
	}

	

	public Vehicle(String license, String color, String size) {
		super();
		this.license = license;
		this.color = color;
		this.size = size;
	}


	public String getLicense() {
		return license;
	}


	public void setLicense(String license) {
		this.license = license;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	@Override
	public String toString() {
		return "Vehicle [license=" + license + ", color=" + color + ", size=" + size + "]";
	}
	
	public void printDetails(){
		System.out.println("The license of this vehicle is " + this.license);
		System.out.println("The color of this vehicle is " + this.color);
		System.out.println("The size of this vehicle is " + this.size);
		
	}
	
	
}
