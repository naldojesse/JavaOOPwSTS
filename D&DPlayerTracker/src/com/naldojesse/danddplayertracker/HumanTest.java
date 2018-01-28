package com.naldojesse.danddplayertracker;

public class HumanTest {
	public static void main(String[] args) {
		Human h = new Human();
		Human h2 = new Human();
		
		h.attack(h2);
		int newHealth = h.getHealth();
		System.out.println(newHealth);
	}
}
