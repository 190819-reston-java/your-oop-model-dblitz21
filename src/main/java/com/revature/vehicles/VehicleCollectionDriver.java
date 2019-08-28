package com.revature.vehicles;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class VehicleCollectionDriver {

	public static void main(String[] args) {
		
		List<Vehicle> vehicleList = new ArrayList<Vehicle>();
		vehicleList.add(new Car("Ferari", "red", 85));
		vehicleList.add(new Car("Honda", "blue", 65));
		vehicleList.add(new Motorcycle("Harley", "black", 55));
		
		System.out.println("Printing out an ArrayList of vehicles");
		System.out.println(vehicleList);
		
		
		List<Car> carList = new ArrayList<Car>();
		carList.add(new Car("Lamborghini", "red", 85));
		carList.add(new Car("Corolla", "blue", 65));
		carList.add(new Car("Batmobile", "black", 125));
		
		System.out.println("\nPrinting out an ArrayList of cars");
		System.out.println(carList);
		
		
		Set<Car> carSet = new HashSet<Car>(carList);
		carSet.add(new Car("Chevy Prism", "maroon", 60));
		
		System.out.println("\nPrinting out an Hashset of Cars taken from the car list");
		System.out.println(carSet);
		
		

	}

}
