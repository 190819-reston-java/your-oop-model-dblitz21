package com.revature.vehicles;

import java.util.Comparator;

public class Car extends Vehicle implements Comparable<Car>, Comparator<Car> {
	static int trafficlevel = 0;
	public Car() {
		
	}

	public Car(String name, String color, int speed) {
		super(name, color, speed);
		trafficlevel++;
		
	}

	public Car(String name) {
		super(name);
		trafficlevel++;
	}
	
	public void checkTires() {
		System.out.println("Four Tires checked out normally!");
	}
	
	public static void checkTraffic() {
		System.out.println("There are " + trafficlevel + " car(s) on the road.");
	}
	
	public int compareTo(Car auto) {
		
		return -1 * (this.getSpeed() - auto.getSpeed());
	}

	@Override
	public int compare(Car auto1, Car auto2) {
		// TODO Auto-generated method stub
		int auto1speed = auto1.getSpeed();
		int auto2speed = auto2.getSpeed();
		
		int out = 0; 
				
		out = auto1speed - auto2speed;
		if (out == 0) {
			return auto1.compareTo(auto2);
		}
		
		return out;
	}
	
	

}
