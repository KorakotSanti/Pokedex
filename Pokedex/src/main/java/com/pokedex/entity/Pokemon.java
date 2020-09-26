package com.pokedex.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pokemon {
	
	@Id
	@Column(name="poke_id")
	private String pokeId;
	@Column(name="name")
	private String name;
	@Column(name="type")
	private String type;
	@Column(name="img_url")
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
}
