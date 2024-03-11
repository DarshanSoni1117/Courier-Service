package com.example.demo.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Branch {

	@Id
	private long id;

	private String location;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="branch_id",referencedColumnName = "id")
	private List<DeliveryMan> deliveryMan;


	public Branch() {
		}

	public Branch(long id, String location,  List<DeliveryMan> deliveryMan) {
		super();
		this.id = id;
		this.location = location;
	//	this.courierdetail = courierdetail;
		this.deliveryMan = deliveryMan;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
public void setDeliveryMan(List<DeliveryMan> deliveryMan) {
		this.deliveryMan = deliveryMan;
	}

	@Override
	public String toString() {
		return "Branch [id=" + id + ", location=" + location +  ", deliveryMan="
				+ deliveryMan + "]";
	}


	public List<DeliveryMan> getDeliveryMan() {
		return deliveryMan;
	}
}
