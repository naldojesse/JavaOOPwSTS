package com.naldojesse.pokedex;

public abstract class PokemonActions implements PokeInterface{
	public abstract Pokemon createPokemon(String name, int health, String type);
	public abstract void attackPokemon(Pokemon pokemon);
}
