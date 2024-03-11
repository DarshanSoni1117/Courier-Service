package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.FeedbackServices;
import com.example.demo.entities.Feedback;

@RestController
public class FeedbackController {

	@Autowired
	FeedbackServices feedbackServices;

	@PostMapping("/feed")
	Feedback add(@RequestBody Feedback feedback) {
		return feedbackServices.add(feedback);
	}

}
