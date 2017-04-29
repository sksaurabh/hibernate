package com.hib.relations.dto;

public class BeerDTO {

	private int beerId;
	private String type;
	private int quantity;
	private double price;
    private KingfisherDTO kingfisherDTO;
	public int getBeerId() {
		return beerId;
	}

	public void setBeerId(int beerId) {
		this.beerId = beerId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public KingfisherDTO getKingfisherDTO() {
		return kingfisherDTO;
	}

	public void setKingfisherDTO(KingfisherDTO kingfisherDTO) {
		this.kingfisherDTO = kingfisherDTO;
	}
}
