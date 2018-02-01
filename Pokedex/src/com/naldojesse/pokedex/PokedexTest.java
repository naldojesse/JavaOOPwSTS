package com.naldojesse.pokedex;

public class PokedexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokedex pokedex = new Pokedex();
		
		//test createPokemon method
		Pokemon p1 = pokedex.createPokemon("Electrode", 110, "Electric");
		Pokemon p2 = pokedex.createPokemon("Charizard",  300,  "Fire");
		
		//test attackPokemon method
		System.out.println(p1.getHealth());
		pokedex.attackPokemon(p1);
		System.out.println(p1.getHealth());
		
		//test  
		
	}

}
