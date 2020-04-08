package ParkingLot;

import java.util.ArrayList;

public class VehiclePark {

	private static final int maxCapacity = 3;
	private ArrayList<Vehicle> CarParkingSlot = new ArrayList<Vehicle>(maxCapacity);
	private ArrayList<Vehicle> TruckParkingSlot = new ArrayList<Vehicle>(maxCapacity);
	private ArrayList<Vehicle> BikeParkingSlot = new ArrayList<Vehicle>(maxCapacity);
	
	/*public VehiclePark() {
		//super();
		this.CarParkingSlot = new ArrayList<Vehicle>(maxCapacity);
		this.BikeParkingSlot = new ArrayList<Vehicle>(maxCapacity);
		this.TruckParkingSlot = new ArrayList<Vehicle>(maxCapacity);
	}*/
	

	public int getMaxCapacity(){
		return maxCapacity;
	}
	
	public int numberOfAvailableSlots(ArrayList slots){
		return this.maxCapacity - slots.size();
	}
		
	public void addVehicles(Vehicle vehicle){
		
		if(vehicle.getSize() == "Bike"){
			if(numberOfAvailableSlots(BikeParkingSlot) > 0){
				BikeParkingSlot.add(vehicle);
			}else if(numberOfAvailableSlots(CarParkingSlot) > 0){
				CarParkingSlot.add(vehicle);
			}else if(numberOfAvailableSlots(TruckParkingSlot) > 0){
				TruckParkingSlot.add(vehicle);
			}else{
				System.out.println("Bike parking is Full, Try next time");
			}
		}
		
		if(vehicle.getSize() == "Car"){
			if(numberOfAvailableSlots(CarParkingSlot) > 0){
				CarParkingSlot.add(vehicle);
			}else if(numberOfAvailableSlots(TruckParkingSlot) > 0){
				TruckParkingSlot.add(vehicle);
			}else{
				System.out.println("Car parking is Full, Try next time");
			}
			
		}
		
		if(vehicle.getSize() == "Truck"){
			if(numberOfAvailableSlots(TruckParkingSlot) > 0){
				TruckParkingSlot.add(vehicle);
			}else{
				System.out.println("Truck parking is Full, Try next time");
			}
			
		}
	}
	
	public void remove(Vehicle vehicle){
		
		if(vehicle.getSize() == "Bike"){
			boolean presence = CheckVehiclePresence(vehicle, BikeParkingSlot);
			if(presence)
				BikeParkingSlot.remove(vehicle);
			
			boolean presence1 = CheckVehiclePresence(vehicle, CarParkingSlot);
			if(presence1)
				CarParkingSlot.remove(vehicle);
			
			boolean presence2 = CheckVehiclePresence(vehicle, TruckParkingSlot);
			if(presence2)
				TruckParkingSlot.remove(vehicle);
		}
		
		if(vehicle.getSize() == "Car"){
			boolean presence1 = CheckVehiclePresence(vehicle, CarParkingSlot);
			if(presence1)
				CarParkingSlot.remove(vehicle);
			
			boolean presence2 = CheckVehiclePresence(vehicle, TruckParkingSlot);
			if(presence2)
				TruckParkingSlot.remove(vehicle);
		}
		
		if(vehicle.getSize() == "Truck"){
			boolean presence2 = CheckVehiclePresence(vehicle, TruckParkingSlot);
			if(presence2)
				TruckParkingSlot.remove(vehicle);
		}
		
		
	}

	private boolean CheckVehiclePresence(Vehicle vehicle, ArrayList<Vehicle> list) {
		
		for(Vehicle vehicleCheck : list){
			
			if(vehicle.getLicense().equalsIgnoreCase(vehicleCheck.getLicense())){
				return true;
			}
		}
		return false;
	}

	public void printParkedVehicleDetails(){
		 
		for(Vehicle vehicle: this.CarParkingSlot){
			vehicle.printDetails();
			System.out.println("++++++++++++++++ \n");
		 
		}
		 
	}

	public ArrayList<Vehicle> getCarParkingSlot() {
		return CarParkingSlot;
	}



	public void setCarParkingSlot(ArrayList<Vehicle> carParkingSlot) {
		CarParkingSlot = carParkingSlot;
	}



	public ArrayList<Vehicle> getTruckParkingSlot() {
		return TruckParkingSlot;
	}



	public void setTruckParkingSlot(ArrayList<Vehicle> truckParkingSlot) {
		TruckParkingSlot = truckParkingSlot;
	}



	public ArrayList<Vehicle> getBikeParkingSlot() {
		return BikeParkingSlot;
	}



	public void setBikeParkingSlot(ArrayList<Vehicle> bikeParkingSlot) {
		BikeParkingSlot = bikeParkingSlot;
	}
	
}
