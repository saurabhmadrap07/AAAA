package com.example.demo.controller;

import com.example.demo.model.Instructor;
import com.example.demo.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/instructors")
public class InstructorController {

    @Autowired
    private InstructorService instructorService;

    @GetMapping
    public List<Instructor> getAllInstructors() {
        return instructorService.getAllInstructors();
    }

    @GetMapping("/{id}")
    public Instructor getInstructorById(@PathVariable int id) {
        return instructorService.getInstructorById(id);
    }

    @PostMapping
    public void addInstructor(@RequestBody Instructor instructor) {
        instructorService.addInstructor(instructor);
    }

    @PutMapping("/{id}")
    public void updateInstructor(@PathVariable int id, @RequestBody Instructor instructor) {
        instructorService.updateInstructor(id, instructor);
    }

    @DeleteMapping("/{id}")
    public void deleteInstructor(@PathVariable int id) {
        instructorService.deleteInstructor(id);
    }
}
