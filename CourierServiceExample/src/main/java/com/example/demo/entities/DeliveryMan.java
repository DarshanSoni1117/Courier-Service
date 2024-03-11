package com.example.demo.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.OneToMany;

@Entity
public class DeliveryMan {

	@Id
	private long id;

	private String name;

	private String contactNumber;

	@OneToMany(targetEntity = Courierdetail.class,cascade = CascadeType.ALL)
	@JoinColumns({
		@JoinColumn(name="DeliveryMan_id",referencedColumnName ="id" ),
		@JoinColumn(name="DeliveryMan_Conatct_Number",referencedColumnName = "contactNumber")
	})
	private List<Courierdetail> courierdetail;



	public DeliveryMan() {

	}




	public DeliveryMan(long id, String name, String contactNumber, List<Courierdetail> courierdetail) {
		super();
		this.id = id;
		this.name = name;
		this.contactNumber = contactNumber;
		this.courierdetail = courierdetail;
	}




	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}


	@Override
	public String toString() {
		return "DeliveryMan [id=" + id + ", name=" + name + ", contactNumber=" + contactNumber + ", courierdetail="
				+ courierdetail + "]";
	}


	public List<Courierdetail> getCourierdetail() {
		return courierdetail;
	}


	public void setCourierdetail(List<Courierdetail> courierdetail) {
		this.courierdetail = courierdetail;
	}






}
