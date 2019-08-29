package com.revature.vehicles;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class DragRace {
	
	private List<Car> autoList = new ArrayList<Car>();
	
	public DragRace() {
		
	}
	
	public void enterRace(Car auto) {
		
		System.out.println(auto.getName() + " has entered the drag race!");
		autoList.add(auto);
	}
	
	public void exitRace(Car auto) {
		
		System.out.println(auto.getName() + " has exited the race!");
		autoList.remove(auto);
		
	}
	
	public void startRace(){
		SortedSet<Car> sortedCarSet = new TreeSet<Car>(autoList);
		System.out.println("When the light turned green");
		
		for (Car a : sortedCarSet) {
			System.out.println(a.getSpeed());
		}
	}

}
