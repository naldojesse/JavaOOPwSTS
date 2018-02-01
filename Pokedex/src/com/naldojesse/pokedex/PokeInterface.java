package com.naldojesse.pokedex;

//• Create an interface for the following methods:
//	
//	• createPokemon(String name, int health, String type): creates a Pokemon.
//	• attackPokemon(Pokemon pokemon): lowers the attacked Pokemon's health by 10
//	• pokemonInfo(Pokemon pokemon): returns the name, health, and type of the pokemon


public interface PokeInterface {
	Pokemon createPokemon(String name, int health, String type);
	void attackPokemon(Pokemon pokemon);
	String pokemonInfo(Pokemon pokemon);
}
