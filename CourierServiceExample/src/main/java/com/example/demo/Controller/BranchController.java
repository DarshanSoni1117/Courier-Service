package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.BranchServices;
import com.example.demo.entities.Branch;

@RestController
public class BranchController {

	@Autowired
	BranchServices branchServices;

	@PostMapping("/b")
	Branch add(@RequestBody Branch branch) {
		return branchServices.add(branch);
	}


	@DeleteMapping("/b/{id}")
	Branch deleteById(@PathVariable("id") long id) {
		return branchServices.deleteById(id);
	}


	@GetMapping("/b/{id}")
	Branch getById(@PathVariable("id") long id) {
		return branchServices.getById(id);
	}

	@GetMapping("/ball")
	List<Branch> getAllBranch(){
		return branchServices.getAllBranch();
	}

}
