package com.naldojesse.pokedex;

public class Pokedex extends PokemonActions implements PokeInterface{
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon p = new Pokemon(name, health, type);
		return p;
	}
	
	public void attackPokemon(Pokemon pokemon) {}
	
    public String pokemonInfo(Pokemon pokemon) {
    		return "Name: " + pokemon.getName() + " Health: " + pokemon.getHealth() + " Type: " + pokemon.getType();
    }

}
