package com.revature.vehicles;

public abstract class Vehicle {
	private int speed;
	private String color;
	private String name;
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	
	public Vehicle(String name, String color, int speed) {
		this.name = name;
		this.speed = speed;
		this.color = color;
		
	}
	
	public Vehicle(String name) {
		this.name = name;
		speed = 35;
		color = "black";
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void drive() {
		System.out.println(name + " is driving at " + speed + "mph.");
	}
	
	public void inspectVehicle() {
		System.out.println(name + " looks in good shape");
	}
	
	public abstract void checkTires();

}
