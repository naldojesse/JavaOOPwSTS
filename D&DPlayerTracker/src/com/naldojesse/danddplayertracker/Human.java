package com.naldojesse.danddplayertracker;

public class Human {
	protected int strength = 3;
	protected int stealth = 3;
	protected int intelligence = 3;
	protected int health = 100;
	
	
	//Reduces health of attacked human by strength of current human
	public void attack(Human human) {
		health -= human.strength;
		System.out.println("Human was attacked!");
	}
	
//	Getters and Setters
	
	public int getStrength() {
		return strength;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}
	
}
