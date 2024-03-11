 package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.DeliveryManServices;
import com.example.demo.entities.DeliveryMan;

@RestController
public class DeliveryManController {

	@Autowired
	DeliveryManServices deliveryManServices;

	@PostMapping("/dmin")
	public DeliveryMan insert(@RequestBody DeliveryMan deliveryMan) {
		return deliveryManServices.add(deliveryMan);
	}

	@DeleteMapping("/dm/{id}")
	public String delete(@PathVariable("id")long id) {
		return deliveryManServices.deleteById(id);
	}

	@GetMapping("/dmall")
	List<DeliveryMan> getAllMan(){
		return deliveryManServices.getAllMan();
	}


	@GetMapping("/dm/{id}")
	DeliveryMan getUserbyId(@PathVariable("id")long id) {
		return deliveryManServices.getUserbyId(id);
	}
}
