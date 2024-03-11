package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Branch;

@Repository
public interface BranchRepo extends JpaRepository<Branch,Long> {

}