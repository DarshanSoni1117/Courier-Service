package com.example.demo.Services;

import java.util.List;

import com.example.demo.entities.Courierdetail;

public interface CourierdetailServices {

		Courierdetail addcourier(Courierdetail courierdetail);

		List<Courierdetail> getall();

		Courierdetail deleteCourierById(long id);

		Courierdetail getbyId(long id);


}
