package com.pokedex.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pokedex.entity.Pokemon;

@Repository
public interface PokemonRepository extends CrudRepository<Pokemon, String>{

}
