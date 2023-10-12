package com.example.demo.service;

import com.example.demo.model.Feedback;
import com.example.demo.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    public List<Feedback> getAllFeedback() {
        return feedbackRepository.findAll();
    }

    public Feedback getFeedbackById(int id) {
        Optional<Feedback> feedback = feedbackRepository.findById(id);
        return feedback.orElse(null);
    }

    public void addFeedback(Feedback feedback) {
        feedbackRepository.save(feedback);
    }

    public void updateFeedback(int id, Feedback updatedFeedback) {
        Optional<Feedback> feedback = feedbackRepository.findById(id);
        if (feedback.isPresent()) {
            Feedback existingFeedback = feedback.get();
            existingFeedback.setStudentId(updatedFeedback.getStudentId());
            existingFeedback.setInstructorName(updatedFeedback.getInstructorName());
            existingFeedback.setFeedback(updatedFeedback.getFeedback());
            existingFeedback.setDate(updatedFeedback.getDate());
            feedbackRepository.save(existingFeedback);
        }
    }

    public void deleteFeedback(int id) {
        feedbackRepository.deleteById(id);
    }

    public List<Feedback> getAllFeedbacks() {
        return null;
    }
}
