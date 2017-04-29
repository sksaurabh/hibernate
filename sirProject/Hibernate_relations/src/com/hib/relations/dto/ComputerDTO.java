package com.hib.relations.dto;

public class ComputerDTO {
	private int id;
	private int hardDiskSize;
	private int noOfProccessor;
	private CpuDTO cpuDTO;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHardDiskSize() {
		return hardDiskSize;
	}

	public void setHardDiskSize(int hardDiskSize) {
		this.hardDiskSize = hardDiskSize;
	}

	public int getNoOfProccessor() {
		return noOfProccessor;
	}

	public void setNoOfProccessor(int noOfProccessor) {
		this.noOfProccessor = noOfProccessor;
	}

	public CpuDTO getCpuDTO() {
		return cpuDTO;
	}

	public void setCpuDTO(CpuDTO cpuDTO) {
		this.cpuDTO = cpuDTO;
	}

}
