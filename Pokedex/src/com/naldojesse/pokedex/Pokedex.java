package com.naldojesse.pokedex;

//• Create a Pokedex class that extends the abstract class above and implements pokemonInfo(Pokemon pokemon).


public class Pokedex extends PokemonActions implements PokeInterface{
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon p = new Pokemon(name, health, type);
		return p;
	}
	
	public void attackPokemon(Pokemon pokemon) {
		int health = pokemon.getHealth();
		pokemon.setHealth(health -= 10);
		System.out.println(pokemon.getHealth());
	}
	
    public String pokemonInfo(Pokemon pokemon) {
    		return "Name: " + pokemon.getName() + " Health: " + pokemon.getHealth() + " Type: " + pokemon.getType();
    }

}
