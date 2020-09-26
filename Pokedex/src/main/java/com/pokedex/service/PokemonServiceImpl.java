package com.pokedex.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokedex.dto.PokemonDTO;
import com.pokedex.entity.Pokemon;
import com.pokedex.exception.PokemonException;
import com.pokedex.repository.PokemonRepository;

@Service(value = "pokemonService")
@Transactional
public class PokemonServiceImpl implements PokemonService{

	@Autowired
	private PokemonRepository pokemonRepository;
	
	@Override
	public List<PokemonDTO> getAllPokemon() throws PokemonException {
		Iterable<Pokemon> pokemons = pokemonRepository.findAll();
		List<PokemonDTO> pList = new ArrayList<PokemonDTO>();
		for(Pokemon p: pokemons) {
			pList.add(PokemonDTO.entityToDTO(p));
		}
		if(pList.isEmpty()) {
			throw new PokemonException("PokemonService.NO_POKEMON_FOUND");
		}
		return pList;
	}
	
	@Override
	public PokemonDTO getPokemonById(String poke_id) throws PokemonException {
		Optional<Pokemon> poke = pokemonRepository.findById(poke_id);
		Pokemon pokemon = poke.orElseThrow(()-> new PokemonException("PokemonService.NO_POKEMON_FOUND"));
		return PokemonDTO.entityToDTO(pokemon);
		
	}

}
