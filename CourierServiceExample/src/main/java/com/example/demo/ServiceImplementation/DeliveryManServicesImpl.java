package com.example.demo.ServiceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Services.DeliveryManServices;
import com.example.demo.dao.DeliveryManRepo;
import com.example.demo.entities.DeliveryMan;

@Service
public class DeliveryManServicesImpl implements DeliveryManServices {

	@Autowired
	DeliveryManRepo deliveryManRepo;


	@Override
	public String deleteById(long id) {
		String str =deliveryManRepo.findById(id).get().toString();
		deliveryManRepo.deleteById(id);
		return "Deleted Sucessfully  "+str;
	}

	@Override
	public List<DeliveryMan> getAllMan() {
	return deliveryManRepo.findAll();
	}

	@Override
	public DeliveryMan getUserbyId(long id) {
		return deliveryManRepo.findById(id).get();
	}

	@Override
	public DeliveryMan add(DeliveryMan deliveryMan) {
				return deliveryManRepo.save(deliveryMan);
	}

}
