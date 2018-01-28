package com.naldojesse.zootracker;

public class Dragon extends Mammal {
//	this.energyLevel = 300;
//	
//	public fly();
//	super.energyLevel = 300;
	public Dragon() {
		energyLevel = 300;
	}
//	int level = this.getEnergyLevel();
//	this.setEnergyLevel(level);
	
	public Dragon fly() {
		System.out.println("RAWRRRRR(Says dragon)");
//		int level = this.getEnergyLevel();
//		this.setEnergyLevel(this.energyLevel-=50);
		energyLevel -= 50;
		return this;
	}
	
	public Dragon eatHumans() {
		System.out.println("CRUNCH(Says dragon eating human)");
//		int level = this.getEnergyLevel();
//		this.setEnergyLevel(this.energyLevel+=25);
		energyLevel += 25;
		return this;
	}
	
	public Dragon attackTown() {
		System.out.println("FIRE!!!!(Sound of a town on fire)");
//		this.setEnergyLevel(this.energyLevel-=100);
		energyLevel -= 100;
		return this;
	}
}
