package com.om.saurabh.hib.dto;

public class CpuDTO {
   private int Cid;
   private  int NoOfFan;
   private double frequency;
   private ComputerDTO computerDTO;
public int getCid() {
	return Cid;
}
public void setCid(int cid) {
	Cid = cid;
}
public int getNoOfFan() {
	return NoOfFan;
}
public void setNoOfFan(int noOfFan) {
	NoOfFan = noOfFan;
}
public double getFrequency() {
	return frequency;
}
public void setFrequency(double frequency) {
	this.frequency = frequency;
}
public ComputerDTO getComputerDTO() {
	return computerDTO;
}
public void setComputerDTO(ComputerDTO computerDTO) {
	this.computerDTO = computerDTO;
}
}