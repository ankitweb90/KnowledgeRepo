package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		

		Customer cust1 = new Customer();
		
		cust1.setName("ankit");
		cust1.setAddess("sunnyvale");
		cust1.setCash(12000.00);
		
		Vehicle vehicle = new Vehicle();
		vehicle.setMake("ford");
		vehicle.setModel("mustang");
		vehicle.setPrice(10000.00);
		Employee emp = new Employee();
		
		cust1.purchaseCar(vehicle, emp, true);
	}

}
