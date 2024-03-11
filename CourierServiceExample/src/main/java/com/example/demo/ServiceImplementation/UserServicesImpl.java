package com.example.demo.ServiceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Services.UserServices;
import com.example.demo.dao.UserRepo;
import com.example.demo.entities.User;

@Service
public class UserServicesImpl implements UserServices {

	@Autowired
	UserRepo userRepo;


	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

	@Override
	public String deleteUser(long id) {
		String str=userRepo.findById(id).get().toString();
		userRepo.deleteById(id);
		return str;
	}

	@Override
	public User getUserbyId(long id) {
		return userRepo.findById(id).get();
	}

	@Override
	public User insertUser(User user) {

		return userRepo.save(user);
	}

}
