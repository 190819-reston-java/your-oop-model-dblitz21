package com.revature.vehicles;

public class ExceptionTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Car c = new Car("Convertible", "green", -5);
			
		}
		catch (NegativeSpeedException s) {
			System.out.println("You can't set a car's speed to negative");
			
		}

	}

}
