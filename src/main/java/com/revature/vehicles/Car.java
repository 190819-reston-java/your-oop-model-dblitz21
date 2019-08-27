package com.revature.vehicles;

public class Car extends Vehicle {
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

}
