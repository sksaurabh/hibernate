package com.om.saurabh.hib.dto;

import java.util.Collection;

public class KingfisherDTO {
	private int id;
	private String name;
	private String location;
	private String Oner;
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

	public String getOner() {
		return Oner;
	}

	public void setOner(String oner) {
		Oner = oner;
	}

	public Collection<BeerDTO> getBeerDTOs() {
		return beerDTOs;
	}

	public void setBeerDTOs(Collection<BeerDTO> beerDTOs) {
		this.beerDTOs = beerDTOs;
	}
}
