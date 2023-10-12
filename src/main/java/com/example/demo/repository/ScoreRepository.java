package com.example.demo.repository;

import com.example.demo.model.Score;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Integer> {

    List<Score> findByStudentId(int studentId);
    // You can add custom query methods here if needed
}
