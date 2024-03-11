package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Feedback;

@Repository
public interface FeedbackRepo extends CrudRepository<Feedback,Long> {

}
