package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Courierdetail;

@Repository
public interface CourierdetailRepo extends JpaRepository<Courierdetail,Long>{

}
