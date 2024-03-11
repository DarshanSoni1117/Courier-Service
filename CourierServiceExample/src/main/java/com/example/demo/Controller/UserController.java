package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.UserServices;
import com.example.demo.entities.User;

@RestController
public class UserController {

	@Autowired
	UserServices userServices;

	@PostMapping("/user")
	public User insertUser(@RequestBody User user) {
		return userServices.insertUser(user);
	}

	@DeleteMapping("/user/{id}")
	public String delete(@PathVariable("id") long id) {
		return userServices.deleteUser(id);
	}
	@GetMapping("/alluser")
	public List<User> getAllUsers(){
		return userServices.getAllUsers();
	}

	@GetMapping("/user/{id}")
	public User GetByid(@PathVariable("id")long id) {
		return userServices.getUserbyId(id);
	}
	
	@PutMapping("/user/{id}")
	public User updatebyId(@PathVariable("id")long id,@RequestBody User user) {
	
		User u=userServices.getUserbyId(id);
		u.setAddress(user.getAddress());
		u.setContactNumber(user.getContactNumber());
		u.setName(user.getName());
		
		userServices.insertUser(u);
		return u;
	}

}
