package com.revature.vehicles;

public class Driver {

	public static void main(String[] args) {
		
		Car ferari = new Car("Ferari", "Red", 95);
		Car delorean = new Car("Delorean", "Silver", 88);
		Car chevy = new Car("Chevrolet");
		Car corolla = new Car("Corolla");
		Car cadillac = new Car("Cadillac", "Green", 80);
		
		Motorcycle chopper = new Motorcycle("Chopper", "black", 85);
		ferari.checkTires();
		ferari.drive();
		chevy.drive();
		System.out.println(ferari.getColor());
		chopper.jump();
		chopper.checkTires();
		ferari.checkTraffic();
		Motorcycle harley = new Motorcycle("Harley", "gray", 75);
		Motorcycle dirtbike = new Motorcycle("Dirt Bike", "red", 95);
		
		//collection methods
		Gang ravens = new Gang();
		ravens.addGangMember(chopper);
		ravens.addGangMember(harley);
		ravens.addGangMember(dirtbike);
		
		ravens.ownTheHighway();
		ravens.expelGangMember(dirtbike);
		ravens.ownTheHighway();

		
		//Drag race methods
		System.out.println("\nA Drag Race is in Progress");
		DragRace race = new DragRace();
		race.startRace();
		race.enterRace(ferari);
		race.enterRace(chevy);
		race.enterRace(cadillac);
		
		race.startRace();
		
		
		
	}
	

}
