package ParkingLot;

import java.util.*;
import java.util.Scanner;

public class ParkingManagement {

	public static void main(String[] args) {
		
		
		Car car1 = new Car("DL0101","Black","Car");
		Bike bike1 = new Bike("MH0101","Red","Bike");
		Truck truck1 = new Truck("TN0101","Blue","Truck");
		Truck truck2 = new Truck("TN0102","Blue","Truck");
		Truck truck3 = new Truck("TN0103","Blue","Truck");
		Car car2 = new Car("PB0101","Golden","Car");
		Car car3 = new Car("PB0102","Golden","Car");
		Car car4 = new Car("PB0103","Golden","Car");
			
		VehiclePark VehiclesCheck = new VehiclePark();		
		
		
		VehiclesCheck.addVehicles(car1);
		VehiclesCheck.addVehicles(car2);
		VehiclesCheck.addVehicles(bike1);	
		VehiclesCheck.addVehicles(truck1);
		VehiclesCheck.addVehicles(truck2);
		VehiclesCheck.addVehicles(truck3);
		VehiclesCheck.addVehicles(car3);
		VehiclesCheck.addVehicles(car4);

		System.out.println("before");
		System.out.println("no. of Bike parked slots : " + VehiclesCheck.getBikeParkingSlot());
		System.out.println("no. of Car parked slots : " + VehiclesCheck.getCarParkingSlot());
		System.out.println("no. of Truck parked slots : " + VehiclesCheck.getTruckParkingSlot());
		
		VehiclesCheck.remove(truck3);
		VehiclesCheck.remove(car2);
		
		System.out.println("After");
		System.out.println("no. of Bike parked slots : " + VehiclesCheck.getBikeParkingSlot());
		System.out.println("no. of Car parked slots : " + VehiclesCheck.getCarParkingSlot());
		System.out.println("no. of Truck parked slots : " + VehiclesCheck.getTruckParkingSlot());
		
	}

}
