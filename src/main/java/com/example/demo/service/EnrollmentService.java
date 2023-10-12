package com.example.demo.service;

import com.example.demo.model.Enrollment;
import com.example.demo.repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnrollmentService {

    @Autowired
    private EnrollmentRepository enrollmentRepository;

    public List<Enrollment> getAllEnrollments() {
        return enrollmentRepository.findAll();
    }

    public Enrollment getEnrollmentById(int id) {
        Optional<Enrollment> enrollment = enrollmentRepository.findById(id);
        return enrollment.orElse(null);
    }

    public void addEnrollment(Enrollment enrollment) {
        enrollmentRepository.save(enrollment);
    }

    public void updateEnrollment(int id, Enrollment updatedEnrollment) {
        Optional<Enrollment> enrollment = enrollmentRepository.findById(id);
        if (enrollment.isPresent()) {
            Enrollment existingEnrollment = enrollment.get();
            existingEnrollment.setStudentId(updatedEnrollment.getStudentId());
            existingEnrollment.setInstructorId(updatedEnrollment.getInstructorId());
            existingEnrollment.setCourseId(updatedEnrollment.getCourseId());
            existingEnrollment.setEnrollmentDate(updatedEnrollment.getEnrollmentDate());
            enrollmentRepository.save(existingEnrollment);
        }
    }

    public void deleteEnrollment(int id) {
        enrollmentRepository.deleteById(id);
    }
}
