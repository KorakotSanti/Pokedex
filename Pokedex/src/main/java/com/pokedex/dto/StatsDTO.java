package com.pokedex.dto;

import com.pokedex.entity.Stats;

public class StatsDTO {
	private Integer statsId;
	private PokemonDTO pokemonDto;
	private Integer healthPoint;
	private Integer attack;
	private Integer defence;
	private Integer specialAttack;
	private Integer specialDefence;
	private Integer speed;
	
	public Integer getStatsId() {
		return statsId;
	}

	public void setStatsId(Integer statsId) {
		this.statsId = statsId;
	}

	public PokemonDTO getPokemonDto() {
		return pokemonDto;
	}

	public void setPokemonDto(PokemonDTO pokemonDto) {
		this.pokemonDto = pokemonDto;
	}

	public Integer getHealthPoint() {
		return healthPoint;
	}
	
	public void setHealthPoint(Integer healthPoint) {
		this.healthPoint = healthPoint;
	}
	
	public Integer getAttack() {
		return attack;
	}
	
	public void setAttack(Integer attack) {
		this.attack = attack;
	}
	
	public Integer getDefence() {
		return defence;
	}
	
	public void setDefence(Integer defence) {
		this.defence = defence;
	}
	
	public Integer getSpecialAttack() {
		return specialAttack;
	}
	
	public void setSpecialAttack(Integer specialAttack) {
		this.specialAttack = specialAttack;
	}
	
	public Integer getSpecialDefence() {
		return specialDefence;
	}
	
	public void setSpecialDefence(Integer specialDefence) {
		this.specialDefence = specialDefence;
	}
	
	public Integer getSpeed() {
		return speed;
	}
	
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	
	public static StatsDTO entityToDto(Stats stats) {
		StatsDTO dto = new StatsDTO();
		dto.setAttack(stats.getAttack());
		dto.setDefence(stats.getDefence());
		dto.setHealthPoint(stats.getHealthPoint());
		dto.setSpecialAttack(stats.getSpecialAttack());
		dto.setSpecialDefence(stats.getSpecialDefence());
		dto.setSpeed(stats.getSpeed());
		dto.setStatsId(stats.getStatsId());
		dto.setPokemonDto(PokemonDTO.entityToDTO(stats.getPokemon()));
		return dto;
	}
	
	public static Stats dtoToEntity(StatsDTO dto) {
		Stats stats = new Stats();
		stats.setAttack(dto.getAttack());
		stats.setDefence(dto.getDefence());
		stats.setHealthPoint(dto.getHealthPoint());
		stats.setSpecialAttack(dto.getSpecialAttack());
		stats.setSpecialDefence(dto.getSpecialDefence());
		stats.setSpeed(dto.getSpeed());
		stats.setPokemon(PokemonDTO.dtoToEntity(dto.getPokemonDto()));
		return stats;
	}
}