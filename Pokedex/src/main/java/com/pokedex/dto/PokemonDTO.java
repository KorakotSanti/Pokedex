package com.pokedex.dto;

import com.pokedex.entity.Pokemon;

public class PokemonDTO {
	private String pokeId;
	private String name;
	private String type;
	private String imgUrl;
	
	public String getPokeId() {
		return pokeId;
	}
	
	public void setPokeId(String pokeId) {
		this.pokeId = pokeId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getImgUrl() {
		return imgUrl;
	}
	
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
	public static PokemonDTO entityToDTO(Pokemon pokemon) {
		PokemonDTO dto = new PokemonDTO();
		dto.setImgUrl(pokemon.getImgUrl());
		dto.setName(pokemon.getName());
		dto.setPokeId(pokemon.getPokeId());
		dto.setType(pokemon.getType());
		return dto;
	}
	
	public static Pokemon dtoToEntity(PokemonDTO pokemonDto) {
		Pokemon pokemon = new Pokemon();
		pokemon.setImgUrl(pokemonDto.getImgUrl());
		pokemon.setName(pokemonDto.getName());
		pokemon.setPokeId(pokemonDto.getPokeId());
		pokemon.setType(pokemonDto.getType());
		return pokemon;
	}
}
