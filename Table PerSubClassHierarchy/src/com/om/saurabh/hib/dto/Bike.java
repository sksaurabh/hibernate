package com.om.saurabh.hib.dto;

public class Bike extends Vehicle {
	private boolean kick;
	private int cc;

	public boolean isKick() {
		return kick;
	}

	public void setKick(boolean kick) {
		this.kick = kick;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}

}
