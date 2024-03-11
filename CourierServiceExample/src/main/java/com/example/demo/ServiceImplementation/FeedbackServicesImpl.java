package com.example.demo.ServiceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Services.FeedbackServices;
import com.example.demo.dao.FeedbackRepo;
import com.example.demo.entities.Feedback;


@Service
public class FeedbackServicesImpl implements FeedbackServices {

	@Autowired
	FeedbackRepo feedbackRepo;

	@Override
	public Feedback add(Feedback feedback) {
		return feedbackRepo.save(feedback);
	}

}
