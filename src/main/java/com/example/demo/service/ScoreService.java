package com.example.demo.service;

import com.example.demo.model.Score;
import com.example.demo.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScoreService {

    @Autowired
    private ScoreRepository scoreRepository;

    public List<Score> getAllScores() {
        return scoreRepository.findAll();
    }

    public Score getScoreById(int id) {
        Optional<Score> score = scoreRepository.findById(id);
        return score.orElse(null);
    }

    public void addScore(Score score) {
        scoreRepository.save(score);
    }

    public void updateScore(int id, Score updatedScore) {
        Optional<Score> score = scoreRepository.findById(id);
        if (score.isPresent()) {
            Score existingScore = score.get();
            existingScore.setStudentID(updatedScore.getStudentID());
            existingScore.setCourseID(updatedScore.getCourseID());
            existingScore.setDateOfExam(updatedScore.getDateOfExam());
            existingScore.setCreditObtained(updatedScore.getCreditObtained());
            scoreRepository.save(existingScore);
        }
    }

    public void deleteScore(int id) {
        scoreRepository.deleteById(id);
    }
}
