package com.om.saurabh.hib.dto;

public class Car extends Vehicle {
	private boolean music_sys;
	private int NoOfDoor;
	private String model;

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
