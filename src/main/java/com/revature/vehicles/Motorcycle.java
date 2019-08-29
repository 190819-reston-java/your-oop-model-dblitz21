package com.revature.vehicles;

import java.io.Serializable;

public class Motorcycle extends Vehicle implements Serializable, Trick, Comparable<Motorcycle> {

	public Motorcycle() {
		// TODO Auto-generated constructor stub
	}

	public Motorcycle(String name, String color, int speed) {
		super(name, color, speed);
		// TODO Auto-generated constructor stub
	}

	public Motorcycle(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("Did you see that? " + this.getName() + " did a flip in the air!!!" );

	}
	
	public void checkTires() {
		System.out.println("Two Tires checked out normally!");
	}
	
	@Override
	public void drive(){
		System.out.println(this.getName() + " is zipping along at " + this.getSpeed() + "mph.");
	}

	public int compareTo(Motorcycle moto) {
		
		return -1 * (this.getSpeed() - moto.getSpeed());
	}
}
