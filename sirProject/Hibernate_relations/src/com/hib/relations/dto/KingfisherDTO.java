package com.hib.relations.dto;

import java.util.Collection;

public class KingfisherDTO {

	// datatypes
	private int id;
	private String name;
	private String location;
	private String owner;
	private Collection<BeerDTO> beerDTOs;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Collection<BeerDTO> getBeerDTOs() {
		return beerDTOs;
	}

	public void setBeerDTOs(Collection<BeerDTO> beerDTOs) {
		this.beerDTOs = beerDTOs;
	}
}
