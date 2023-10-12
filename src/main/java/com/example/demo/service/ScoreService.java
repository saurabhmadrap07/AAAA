package com.example.demo.service;

import com.example.demo.model.Score;
import com.example.demo.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService {
    private final ScoreRepository scoreRepository;

    @Autowired
    public ScoreService(ScoreRepository scoreRepository) {
        this.scoreRepository = scoreRepository;
    }

    public List<Score> getAllScores() {
        return scoreRepository.findAll();
    }

    public Score getScoreById(int scoreId) {
        return scoreRepository.findById(scoreId).orElse(null);
    }

    public List<Score> getScoresByStudentId(int studentId) {
        return scoreRepository.findByStudentId(studentId);
    }

    public Score addScore(Score score) {
        return scoreRepository.save(score);
    }

    public Score updateScore(Score score) {
        return scoreRepository.save(score);
    }

    public void deleteScore(int scoreId) {
        scoreRepository.deleteById(scoreId);
    }

    // Add more methods as needed for score-related business logic
}
