package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Courierdetail {

	@Id
	private long id;

	private String originAddress;

	private String destinationAddress;


	public Courierdetail(long id, String originAddress, String destinationAddress) {
		super();
		this.id = id;
		this.originAddress = originAddress;
		this.destinationAddress = destinationAddress;

	}

	public Courierdetail() {

	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getOriginAddress() {
		return originAddress;
	}
	public void setOriginAddress(String originAddress) {
		this.originAddress = originAddress;
	}
	public String getDestinationAddress() {
		return destinationAddress;
	}
	public void setDestinationAddress(String destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	@Override
	public String toString() {
		return "Courierdetail [id=" + id + ", originAddress=" + originAddress + ", destinationAddress="
				+ destinationAddress +  "]";
	}




}
