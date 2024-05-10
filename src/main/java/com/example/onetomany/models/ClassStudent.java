package com.example.onetomany.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

@Entity
@Table(name = "class-student")
public class ClassStudent {
    @EmbeddedId
    private ClassStudentId id;

    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name = "student-id")
    @JsonIgnore
    private Student student;

    @ManyToOne
    @MapsId("classId")
    @JoinColumn(name = "class-id")
    @JsonIgnore
    private Class clazz;

    @Nationalized
    private String subject;

    public ClassStudent() {
    }

    public ClassStudent(ClassStudentId classStudentId, Student student, Class clazz, String subject) {
        this.id = classStudentId;
        this.student = student;
        this.clazz = clazz;
        this.subject = subject;
    }

    public ClassStudentId getClassStudentId() {
        return id;
    }

    public void setClassStudentId(ClassStudentId classStudentId) {
        this.id = classStudentId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
