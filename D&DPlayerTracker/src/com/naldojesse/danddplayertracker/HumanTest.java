package com.naldojesse.danddplayertracker;

public class HumanTest {
	public static void main(String[] args) {
		Human h = new Human();
		Human h2 = new Human();
		
		//testing health get and set
		System.out.println(h.getHealth());
		h.setHealth(300);
		System.out.println(h.getHealth());
		
		//testing strength get and set
		System.out.println(h.getStrength());
		h.setStrength(10);
		System.out.println(h.getStrength());
		
		//testing stealth get and set
		System.out.println(h.getStealth());
		h.setStealth(10);
		System.out.println(h.getStealth());
		
		
		//testing intelligence get and set
		System.out.println(h.getIntelligence());
		h.setIntelligence(10);
		System.out.println(h.getIntelligence());
		
		//testing attack method
		h.attack(h2);
		int newHealth = h.getHealth();
		System.out.println(newHealth);
	
		//testing wizard class
		Wizard w = new Wizard();
		System.out.println("The Wizard is here!");
		System.out.println(w.getHealth());
		System.out.println(w.getIntelligence());
		
	}
}
