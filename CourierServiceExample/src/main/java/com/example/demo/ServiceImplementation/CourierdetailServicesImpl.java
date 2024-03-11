package com.example.demo.ServiceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Services.CourierdetailServices;
import com.example.demo.dao.CourierdetailRepo;
import com.example.demo.entities.Courierdetail;

@Service
public class CourierdetailServicesImpl  implements CourierdetailServices{

	@Autowired
	CourierdetailRepo courierdetailRepo;

	@Override
	public Courierdetail addcourier(Courierdetail courierdetail) {

		return courierdetailRepo.save(courierdetail);
	}


	@Override
	public List<Courierdetail> getall() {

		return courierdetailRepo.findAll();
	}


	@Override
	public Courierdetail deleteCourierById(long id) {
		Courierdetail c1=courierdetailRepo.findById(id).get();
		courierdetailRepo.deleteById(id);
		return c1;
	}


	@Override
	public Courierdetail getbyId(long id) {
		return courierdetailRepo.findById(id).get();
	}

}
