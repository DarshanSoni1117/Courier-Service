package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Feedback {

	@Id
	private long id;

	private String userResponse;

	@OneToOne
	@JoinColumn(name="courier_Id",referencedColumnName = "id")
	private Courierdetail courierdetail;


	@ManyToOne()
	@JoinColumn(name="DeliveryMan_id", referencedColumnName = "id")
	private DeliveryMan deliveryMan;



	public DeliveryMan getDeliveryMan() {
		return deliveryMan;
	}

	public void setDeliveryMan(DeliveryMan deliveryMan) {
		this.deliveryMan = deliveryMan;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}




	public String getUserResponse() {
		return userResponse;
	}

	public void setUserResponse(String userResponse) {
		this.userResponse = userResponse;
	}

	public Courierdetail getCourierdetail() {
		return courierdetail;
	}

	public void setCourierdetail(Courierdetail courierdetail) {
		this.courierdetail = courierdetail;
	}



	public Feedback(long id, String userResponse, Courierdetail courierdetail, DeliveryMan deliveryMan) {
		super();
		this.id = id;
		this.userResponse = userResponse;
		this.courierdetail = courierdetail;
		this.deliveryMan = deliveryMan;
	}

	public Feedback() {

	}



	@Override
	public String toString() {
		return "Feedback [id=" + id + ", userResponse=" + userResponse + ", courierdetail=" + courierdetail
				+ ", deliveryMan=" + deliveryMan + "]";
	}



}

