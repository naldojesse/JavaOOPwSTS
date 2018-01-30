package com.naldojesse.danddplayertracker;

public class Samurai extends Human{
//	protected int health = 200;
	public static int samuraiCount = 0;
	
	public Samurai() {
		health = 200;
		samuraiCount++;
	}
	
	public void deathBlow(Human h) {
		h.health = 0;
		health -= health/2;
	}
	
	public void meditate() {
		health += health/2;
	}
	
	public int howMany() {
		return samuraiCount;
	}
	
	
}
