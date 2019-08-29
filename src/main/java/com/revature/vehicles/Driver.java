package com.revature.vehicles;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car a = new Car("Ferari", "Red", 65);
		Car b = new Car("Chevrolet");
		Car cadillac = new Car("Cadillac", "Green", 120);
		Motorcycle c = new Motorcycle("Chopper", "black", 85);
		a.checkTires();
		a.drive();
		c.drive();
		System.out.println(a.getColor());
		c.jump();
		c.checkTires();
		a.checkTraffic();
		Motorcycle d = new Motorcycle("Harley", "gray", 75);
		Motorcycle e = new Motorcycle("Dirt Bike", "red", 95);
		
		//collection methods
		Gang ravens = new Gang();
		ravens.addGangMember(c);
		ravens.addGangMember(d);
		ravens.addGangMember(e);
		
		ravens.ownTheHighway();
		
		ravens.expelGangMember(d);
		
		ravens.ownTheHighway();
//		DragRace race = new DragRace();
//		race.enterRace(a);
//		race.enterRace(b);
//		race.enterRace(cadillac);
//		
//		race.startRace();
		
		
		
	}
	

}
