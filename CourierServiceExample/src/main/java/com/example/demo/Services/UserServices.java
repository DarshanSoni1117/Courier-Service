package com.example.demo.Services;

import java.util.List;

import com.example.demo.entities.User;


public interface UserServices {

	User insertUser(User user);
	String deleteUser(long id);
	List<User> getAllUsers();
	User getUserbyId(long id);
}
