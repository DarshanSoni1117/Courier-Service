package com.example.demo.Services;

import java.util.List;

import com.example.demo.entities.DeliveryMan;


public interface DeliveryManServices {

	DeliveryMan add(DeliveryMan deliveryMan);

	String deleteById(long id);

	List<DeliveryMan> getAllMan();
	DeliveryMan getUserbyId(long id);

}
