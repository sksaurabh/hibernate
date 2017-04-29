package com.om.saurabh.hib.dto;

public class ComputerDTO {

	private int id;
	private int HarddiskSize;
	private int NoOfProcess;
	private CpuDTO cpuDTO;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHarddiskSize() {
		return HarddiskSize;
	}

	public void setHarddiskSize(int harddiskSize) {
		HarddiskSize = harddiskSize;
	}

	public int getNoOfProcess() {
		return NoOfProcess;
	}

	public void setNoOfProcess(int noOfProcess) {
		NoOfProcess = noOfProcess;
	}

	public CpuDTO getCpuDTO() {
		return cpuDTO;
	}

	public void setCpuDTO(CpuDTO cpuDTO) {
		this.cpuDTO = cpuDTO;
	}

}
