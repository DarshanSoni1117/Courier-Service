package com.example.demo.Services;

import java.util.List;

import com.example.demo.entities.Branch;

public interface BranchServices {

	Branch add(Branch branch);
	Branch deleteById(long id);
	Branch getById(long id);
	List<Branch> getAllBranch();

}
