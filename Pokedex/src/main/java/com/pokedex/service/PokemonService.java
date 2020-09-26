package com.pokedex.service;

import java.util.List;

import com.pokedex.dto.PokemonDTO;
import com.pokedex.entity.Pokemon;
import com.pokedex.exception.PokemonException;

public interface PokemonService {
	List<PokemonDTO> getAllPokemon() throws PokemonException;
	PokemonDTO getPokemonById(String poke_id) throws PokemonException;
}
