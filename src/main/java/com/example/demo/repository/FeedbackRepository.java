package com.example.demo.repository;

import com.example.demo.model.Feedback;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {

    List<Feedback> findByStudentID(int studentId);
    // You can add custom query methods here if needed
}
