package com.pokedex.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pokedex.entity.Stats;

@Repository
public interface StatsRepository extends CrudRepository<Stats, Integer>{

}
