package com.example.demo.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer")
public class User {

	@Id
	private long id;

	private String name;

	private String address;

	@Column(length=10)
	private long contactNumber;

	@OneToMany(targetEntity = Courierdetail.class ,cascade = CascadeType.ALL)
	@JoinColumn(name="UserId", referencedColumnName = "id")
	private List<Courierdetail> courierdetail;


	public User() {

	}

	public User(long id, String name, String address, long contactNumber, List<Courierdetail> courierdetail) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public List<Courierdetail> getCourierdetail() {
		return courierdetail;
	}

	public void setCourierdetail(List<Courierdetail> courierdetail) {
		this.courierdetail = courierdetail;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + ", contactNumber=" + contactNumber
				+ ", courierdetail=" + courierdetail + "]";
	}


}
