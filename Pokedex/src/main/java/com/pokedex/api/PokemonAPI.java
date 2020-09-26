package com.pokedex.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pokedex.dto.PokemonDTO;
import com.pokedex.exception.PokemonException;
import com.pokedex.service.PokemonService;

@RestController
@RequestMapping(value = "PokemonAPI")
public class PokemonAPI {
	
	@Autowired
	private PokemonService pokemonService;
	
	@GetMapping("getAllPokemons")
	public ResponseEntity<List<PokemonDTO>> getAllPokemon() throws PokemonException {
		List<PokemonDTO> pList = pokemonService.getAllPokemon();
		return new ResponseEntity<List<PokemonDTO>>(pList, HttpStatus.OK);
	}
}
