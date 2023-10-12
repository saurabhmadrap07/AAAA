package com.example.demo.model.controller;

import com.example.demo.model.Enrollment;
import com.example.demo.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enrollments")
public class EnrollmentController {

    @Autowired
    private EnrollmentService enrollmentService;

    @GetMapping
    public List<Enrollment> getAllEnrollments() {
        return enrollmentService.getAllEnrollments();
    }

    @GetMapping("/{id}")
    public Enrollment getEnrollmentById(@PathVariable int id) {
        return enrollmentService.getEnrollmentById(id);
    }

    @PostMapping
    public void addEnrollment(@RequestBody Enrollment enrollment) {
        enrollmentService.addEnrollment(enrollment);
    }

    @PutMapping("/{id}")
    public void updateEnrollment(@PathVariable int id, @RequestBody Enrollment enrollment) {
        enrollmentService.updateEnrollment(id, enrollment);
    }

    @DeleteMapping("/{id}")
    public void deleteEnrollment(@PathVariable int id) {
        enrollmentService.deleteEnrollment(id);
    }
}
