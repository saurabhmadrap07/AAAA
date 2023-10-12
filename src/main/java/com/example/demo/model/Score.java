package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scoreID;
    private Long studentID;
    private Long courseID;
    private Date dateOfExam;
    private BigDecimal creditObtained;

    public Score() {
        // Default constructor
    }

    public Score(Long studentID, Long courseID, Date dateOfExam, BigDecimal creditObtained) {
        this.studentID = studentID;
        this.courseID = courseID;
        this.dateOfExam = dateOfExam;
        this.creditObtained = creditObtained;
    }

    public Long getScoreID() {
        return scoreID;
    }

    public void setScoreID(Long scoreID) {
        this.scoreID = scoreID;
    }

    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

    public Long getCourseID() {
        return courseID;
    }

    public void setCourseID(Long courseID) {
        this.courseID = courseID;
    }

    public Date getDateOfExam() {
        return dateOfExam;
    }

    public void setDateOfExam(Date dateOfExam) {
        this.dateOfExam = dateOfExam;
    }

    public BigDecimal getCreditObtained() {
        return creditObtained;
    }

    public void setCreditObtained(BigDecimal creditObtained) {
        this.creditObtained = creditObtained;
    }
}
