package com.example.demo.model.controller;


import com.example.demo.model.Score;
import com.example.demo.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/scores")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @GetMapping
    public List<Score> getAllScores() {
        return scoreService.getAllScores();
    }

    @GetMapping("/{id}")
    public Score getScoreById(@PathVariable int id) {
        return scoreService.getScoreById(id);
    }

    @PostMapping
    public void addScore(@RequestBody Score score) {
        scoreService.addScore(score);
    }

    @PutMapping("/{id}")
    public void updateScore(@PathVariable int id, @RequestBody Score score) {
        scoreService.updateScore(id, score);
    }

    @DeleteMapping("/{id}")
    public void deleteScore(@PathVariable int id) {
        scoreService.deleteScore(id);
    }
}
