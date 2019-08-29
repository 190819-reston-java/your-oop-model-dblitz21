package com.revature.vehicles;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Gang extends ArrayList<Motorcycle> {
	
	private List<Motorcycle> motorList = new ArrayList<Motorcycle>();
	public Gang() {
		
	}
	
	public List getMotorList() {
		return motorList;
	}
	
	public void addGangMember(Motorcycle moto) {
		this.motorList.add(moto);
	}
	
	public void expelGangMember(Motorcycle moto) {
		this.motorList.remove(moto);
	}
	
	public void ownTheHighway(){
		//motorList.sort();
		
		SortedSet<Motorcycle> sortedCarSet = new TreeSet<Motorcycle>(motorList);
		
		for (Motorcycle a : sortedCarSet) {
			System.out.println(a.getName() + " revs up its engine and races along the highway at " 
			+ a.getSpeed() + "mph");
		}
	}

}
