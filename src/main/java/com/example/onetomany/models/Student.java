package com.example.onetomany.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

import java.util.List;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Nationalized
    private String nameStudent;

    private String ageStudent;

    @ManyToOne
    @JoinColumn(name = "id-school")
    private School school;

    @OneToMany(mappedBy = "student")
    private List<ClassStudent> classStudent;

    public Student() {
    }

    public Student(Long id, String nameStudent, String ageStudent, School school, List<ClassStudent> classStudent) {
        this.id = id;
        this.nameStudent = nameStudent;
        this.ageStudent = ageStudent;
        this.school = school;
        this.classStudent = classStudent;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public List<ClassStudent> getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(List<ClassStudent> classStudent) {
        this.classStudent = classStudent;
    }

    public Student(Long id) {
        this.id = id;
    }

    public Student(Long id, String nameStudent, String ageStudent) {
        this.id = id;
        this.nameStudent = nameStudent;
        this.ageStudent = ageStudent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getAgeStudent() {
        return ageStudent;
    }

    public void setAgeStudent(String ageStudent) {
        this.ageStudent = ageStudent;
    }
}
