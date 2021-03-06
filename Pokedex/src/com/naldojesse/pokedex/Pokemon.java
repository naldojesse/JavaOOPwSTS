package com.naldojesse.pokedex;

//• Create a Pokemon class with:
//	
//	• name, health, and type member variables.
//	• a count static variable that keeps the number of Pokemon created in the program.
//	• getters and setters for each member variable.
//a constructor class to set the instance's name, health, and type on creation

public class Pokemon {
	private String name;
	private int health;
	private String type;
	
	private static int count = 0;
	
	Pokemon(String name, int health, String type) {
		this.name = name;
		this.health = health;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Pokemon.count = count;
	}
	
	
}
