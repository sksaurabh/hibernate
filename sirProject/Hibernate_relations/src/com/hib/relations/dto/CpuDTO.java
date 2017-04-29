package com.hib.relations.dto;

public class CpuDTO {
	private int id;
	private int noOfFan;
	private int frequency;
	private ComputerDTO computerDTO;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNoOfFan() {
		return noOfFan;
	}

	public void setNoOfFan(int noOfFan) {
		this.noOfFan = noOfFan;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public ComputerDTO getComputerDTO() {
		return computerDTO;
	}

	public void setComputerDTO(ComputerDTO computerDTO) {
		this.computerDTO = computerDTO;
	}

}
