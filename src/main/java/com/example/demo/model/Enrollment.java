package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long enrollmentID;
    
    @ManyToOne
    @JoinColumn(name = "instructorID")
    private Instructor instructor;
    
    private Date enrollmentDate;
    
    @ManyToOne
    @JoinColumn(name = "studentID")
    private Student student;
    
    @ManyToOne
    @JoinColumn(name = "courseID")
    private Course course;

    public Enrollment() {
        // Default constructor
    }

    public Enrollment(Instructor instructor, Date enrollmentDate, Student student, Course course) {
        this.instructor = instructor;
        this.enrollmentDate = enrollmentDate;
        this.student = student;
        this.course = course;
    }

    public Long getEnrollmentID() {
        return enrollmentID;
    }

    public void setEnrollmentID(Long enrollmentID) {
        this.enrollmentID = enrollmentID;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
