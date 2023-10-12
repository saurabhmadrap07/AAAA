package com.example.demo.repository;

import com.example.demo.model.Enrollment;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, Integer> {

    List<Enrollment> findByStudentID(int studentId);
    // You can add custom query methods here if needed

    List<Enrollment> findByInstructorID(int instructorId);
}
