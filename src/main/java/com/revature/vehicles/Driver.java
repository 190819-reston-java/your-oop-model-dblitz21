package com.revature.vehicles;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car a = new Car("Ferari", "Red", 65);
		Car b = new Car("Chevrolet");
		Motorcycle c = new Motorcycle("Chopper", "black", 85);
		a.checkTires();
		a.drive();
		c.drive();
		System.out.println(a.getColor());
		c.jump();
		a.checkTires();
		a.checkTraffic();

	}
	

}
