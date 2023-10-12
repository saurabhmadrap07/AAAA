package com.example.demo.model.controller;

import com.example.demo.model.Feedback;
import com.example.demo.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feedbacks")
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @GetMapping
    public List<Feedback> getAllFeedbacks() {
        return feedbackService.getAllFeedbacks();
    }

    @GetMapping("/{id}")
    public Feedback getFeedbackById(@PathVariable int id) {
        return feedbackService.getFeedbackById(id);
    }

    @PostMapping
    public void addFeedback(@RequestBody Feedback feedback) {
        feedbackService.addFeedback(feedback);
    }

    @PutMapping("/{id}")
    public void updateFeedback(@PathVariable int id, @RequestBody Feedback feedback) {
        feedbackService.updateFeedback(id, feedback);
    }

    @DeleteMapping("/{id}")
    public void deleteFeedback(@PathVariable int id) {
        feedbackService.deleteFeedback(id);
    }
}
