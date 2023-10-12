package com.example.demo.repository;

import com.example.demo.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Integer> {
    // You can add custom query methods here if needed
}
