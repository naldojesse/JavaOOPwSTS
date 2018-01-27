package com.naldojesse.zootracker;

public class Gorilla extends Mammal{	
	
	public Gorilla throwSomething() {
		System.out.println("This gorilla has thrown something!");
		int level = this.getEnergyLevel();
		this.setEnergyLevel(level-=5);
		return this;
	}
	public Gorilla eatBananas() {
		System.out.println("This gorilla's satisfaction has increased from eating a banana!");
		int energyLevel = this.getEnergyLevel();
		this.setEnergyLevel(energyLevel+=10);
		return this;
	}
	public Gorilla climb() {
		System.out.println("This gorilla has climbed a tree!");
	    int energyLevel = this.getEnergyLevel();
	    this.setEnergyLevel(energyLevel-=10);
	    return this;
	}
}
