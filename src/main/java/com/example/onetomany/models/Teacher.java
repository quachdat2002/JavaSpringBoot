package com.example.onetomany.models;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

@Entity
@Table(name = "teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Nationalized
    private String nameTeacher;
    private String ageTeacher;

    @ManyToOne
    @JoinColumn(name = "id-school")
    private School school;

    public Teacher(Long id, String nameTeacher, String ageTeacher) {
        this.id = id;
        this.nameTeacher = nameTeacher;
        this.ageTeacher = ageTeacher;
    }

    public Teacher(Long id, String nameTeacher, String ageTeacher, School school) {
        this.id = id;
        this.nameTeacher = nameTeacher;
        this.ageTeacher = ageTeacher;
        this.school = school;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Teacher() {
    }

    public String getAgeTeacher() {
        return ageTeacher;
    }

    public void setAgeTeacher(String ageTeacher) {
        this.ageTeacher = ageTeacher;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }
}
