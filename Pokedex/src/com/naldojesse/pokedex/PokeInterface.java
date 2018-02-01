package com.naldojesse.pokedex;

public interface PokeInterface {
	Pokemon createPokemon(String name, int health, String type);
	default void attackPokemon(Pokemon pokemon) {
//		pokemon.healt -= 10;
		int health = pokemon.getHealth();
		pokemon.setHealth(health -= 10);
	}
//	static String pokemonInfo(Pokemon pokemon) {
//		return "Name: " + pokemon.getName() + " Health: " + pokemon.getHealth() + " Type: " + pokemon.getType();
//	}
	String pokemonInfo(Pokemon pokemon);
}
