package com.pokedex.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Stats {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="stats_id")
	private Integer statsId;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "poke_id", unique = true)
	private Pokemon pokemon;
	@Column(name="health_point")
	private Integer healthPoint;
	@Column(name="attack")
	private Integer attack;
	@Column(name="defence")
	private Integer defence;
	@Column(name="special_attack")
	private Integer specialAttack;
	@Column(name="sepcial_defence")
	private Integer specialDefence;
	@Column(name="speed")
	private Integer speed;

	public Integer getStatsId() {
		return statsId;
	}

	public void setStatsId(Integer statsId) {
		this.statsId = statsId;
	}

	public Pokemon getPokemon() {
		return pokemon;
	}

	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
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
	
	
}
