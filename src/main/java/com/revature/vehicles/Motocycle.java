package com.revature.vehicles;

import java.io.Serializable;

public class Motocycle extends Vehicle implements Serializable, Trick {

	public Motocycle() {
		// TODO Auto-generated constructor stub
	}

	public Motocycle(String name, String color, int speed) {
		super(name, color, speed);
		// TODO Auto-generated constructor stub
	}

	public Motocycle(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("Did you see that? " + this.getName() + " did a flip in the air!!!" );

	}
	
	public void checkTires() {
		System.out.println("Four Tires checked out normally!");
	}
	
	@Override
	public void drive(){
		System.out.println(this.getName() + " is zipping along at " + this.getSpeed() + "mph");
	}

}
