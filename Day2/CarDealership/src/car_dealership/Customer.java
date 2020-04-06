package car_dealership;

public class Customer {
	
	
	private String name;
	private String addess;
	private double cash;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddess() {
		return addess;
	}
	public void setAddess(String addess) {
		this.addess = addess;
	}
	public double getCash() {
		return cash;
	}
	public void setCash(double cash) {
		this.cash = cash;
	}


	public void purchaseCar(Vehicle vehicle, Employee emp, Boolean finance) {
		
		
		emp.handleCustomer(this, finance, vehicle);
	}

}
