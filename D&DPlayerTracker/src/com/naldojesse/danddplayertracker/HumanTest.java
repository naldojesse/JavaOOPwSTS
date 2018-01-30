package com.naldojesse.danddplayertracker;

//● Create Ninja, Wizard, and Samurai classes that all extend from the Human class.
//● Wizard: Set default health to 50
//● Wizard: Set default intelligence to 8
//● Wizard: Add a method heal(Human) that heals the other human by the wizard's intelligence
//● Wizard: Add a method fireball(Human) that decreases the other human's health by the wizard's intelligence * 3
//● Ninja: Set default stealth to 10
//● Ninja: Add a method steal(Human) that takes the amount of stealth the ninja has, removes it from the other human's health, and adds it to the ninja's
//● Ninja: Add a method runAway() that decreases their health by 10
//● Samurai: Set a default health of 200
//● Samurai: Add a method deathBlow(Human) that kills the other human, but reduces the Samurai's health by half
//● Samurai: Add a method meditate() that heals the Samurai for half of their current health.
//● Samurai: Add a method howMany() that returns the total current number of Samurai.

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
		
		System.out.println(h2.getHealth());
		w.heal(h2);
		System.out.println(h2.getHealth());
		
		System.out.println(h.getHealth());
		w.fireball(h);
		System.out.println(h.getHealth());
		
		//testing Ninja class
		Ninja n = new Ninja();
		System.out.println("The ninja is here!");
		System.out.println(n.getStealth());
		
		System.out.println(w.getHealth());
		n.steal(w);
		System.out.println(w.getHealth());
		
		System.out.println(n.getHealth());
		n.runAway();
		System.out.println(n.getHealth());

		//testing Samurai class
		int samuraiCountBefore = Samurai.howMany();
		System.out.println(samuraiCountBefore);
		
		Samurai s = new Samurai();
		System.out.println("The Samurai is here!");
		System.out.println(s.getHealth());
		
		System.out.println(n.getHealth());
		s.deathBlow(n);
		System.out.println(n.getHealth());
		System.out.println(s.getHealth());
		s.meditate();
		System.out.println(s.getHealth());
		
		int samuraiCount = Samurai.howMany();
		System.out.println(samuraiCount);
		
	}
}
