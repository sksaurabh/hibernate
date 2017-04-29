package com.om.saurabh.hib.dto;

public class Car extends Vehicle {
	private boolean music_sys;
	private int NoOfDoor;
	private String model;
	private int id;
	private String name;
	private String type;
	private String color;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isMusic_sys() {
		return music_sys;
	}

	public void setMusic_sys(boolean music_sys) {
		this.music_sys = music_sys;
	}

	public int getNoOfDoor() {
		return NoOfDoor;
	}

	public void setNoOfDoor(int noOfDoor) {
		NoOfDoor = noOfDoor;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
