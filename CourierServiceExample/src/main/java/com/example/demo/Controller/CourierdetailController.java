package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.CourierdetailServices;
import com.example.demo.entities.Courierdetail;

@RestController
public class CourierdetailController {

	@Autowired
    CourierdetailServices courierdetailServices;

	@PostMapping("/cd")
	public Courierdetail addcourier(@RequestBody  Courierdetail courierdetail) {
		return courierdetailServices.addcourier(courierdetail);

	}
	@GetMapping("/all")
	public List<Courierdetail> getall(){
		return courierdetailServices.getall();
	}

	@DeleteMapping("/cd/{id}")
	public Courierdetail deleteById(@PathVariable("id")long id) {
		return courierdetailServices.deleteCourierById(id);
	}

	@GetMapping("/cd/{id}")
    public Courierdetail getById(@PathVariable("id") long id) {
		return courierdetailServices.getbyId(id);
	}
}
