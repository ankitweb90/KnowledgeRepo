package car_dealership;


public class Employee {
	
	
	public void handleCustomer(Customer customer, Boolean finance, Vehicle vehicle) {
		
		if(finance==true) {
			
			double loanAmount = vehicle.getPrice() - customer.getCash();
			
			runCreditHistory(customer, loanAmount);
		}
		else if(vehicle.getPrice() <= customer.getCash()){
			
			processTransaction(customer, vehicle);
			
		}else {
			System.out.println("customer needs more money");
		}
		
	}
	

	private void processTransaction(Customer customer, Vehicle vehicle) {
		System.out.println("customer purchased vehicle with cash - vehicle:" + vehicle.getModel());
		
	}

	public void runCreditHistory(Customer customer, double loanAmount) {
		
		System.out.println("ran credit history for customer");
		System.out.println("Approved customer");
		
	}
}
