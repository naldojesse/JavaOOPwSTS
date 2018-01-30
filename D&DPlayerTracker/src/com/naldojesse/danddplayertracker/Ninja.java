package com.naldojesse.danddplayertracker;

public class Ninja extends Human{
//	protected int stealth = 10;
	
	public Ninja() {
		stealth = 10;
	}
	
	public void steal(Human h) {
		int hHealth = h.getHealth();
		if (hHealth < 10) {
			h.setHealth(0);
		}
		h.setHealth(hHealth -= stealth);
		health += hHealth;
		
	}
	
	public void runAway() {
		health -= 10;
	}
}
