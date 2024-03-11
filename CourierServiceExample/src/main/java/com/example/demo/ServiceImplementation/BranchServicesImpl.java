package com.example.demo.ServiceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Services.BranchServices;
import com.example.demo.dao.BranchRepo;
import com.example.demo.entities.Branch;

@Service
public class BranchServicesImpl implements BranchServices {

	@Autowired
	BranchRepo branchRepo;

	@Override
	public Branch deleteById(long id) {
	Branch b=branchRepo.findById(id).get();
	branchRepo.deleteById(id);
		return b;
	}

	@Override
	public Branch getById(long id) {
		return branchRepo.findById(id).get();
	}

	@Override
	public List<Branch> getAllBranch() {
		return branchRepo.findAll();
	}

	@Override
	public Branch add(Branch branch) {
		return branchRepo.save(branch);
	}

}
