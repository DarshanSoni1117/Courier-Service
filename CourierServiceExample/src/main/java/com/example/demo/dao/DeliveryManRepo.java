package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.DeliveryMan;

@Repository
public interface DeliveryManRepo extends JpaRepository<DeliveryMan, Long> {

}
