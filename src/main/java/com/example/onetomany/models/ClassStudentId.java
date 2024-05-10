package com.example.onetomany.models;

import jakarta.persistence.Column;

import java.io.Serializable;

public class ClassStudentId implements Serializable {
    @Column(name = "class-id")
    private Long classId;
    @Column(name = "student-id")
    private Long studentId;

    public ClassStudentId() {
    }

    public ClassStudentId(Long classId, Long studentId) {
        this.classId = classId;
        this.studentId = studentId;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
}
