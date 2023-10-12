package com.example.demo.service;

import com.example.demo.model.Enrollment;
import com.example.demo.repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentService {
    private final EnrollmentRepository enrollmentRepository;

    @Autowired
    public EnrollmentService(EnrollmentRepository enrollmentRepository) {
        this.enrollmentRepository = enrollmentRepository;
    }

    public List<Enrollment> getAllEnrollments() {
        return enrollmentRepository.findAll();
    }

    public Enrollment getEnrollmentById(int enrollmentId) {
        return enrollmentRepository.findById(enrollmentId).orElse(null);
    }

    public List<Enrollment> getEnrollmentsByStudentId(int studentId) {
        return enrollmentRepository.findByStudentID(studentId);
    }

    public List<Enrollment> getEnrollmentsByInstructorId(int instructorId) {
        return enrollmentRepository.findByInstructorID(instructorId);
    }

    public Enrollment addEnrollment(Enrollment enrollment) {
        return enrollmentRepository.save(enrollment);
    }

    public Enrollment updateEnrollment(Enrollment enrollment) {
        return enrollmentRepository.save(enrollment);
    }

    public void deleteEnrollment(int enrollmentId) {
        enrollmentRepository.deleteById(enrollmentId);
    }

    // Add more methods as needed for enrollment-related business logic
}
