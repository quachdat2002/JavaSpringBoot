package com.example.onetomany.models;

import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

import java.util.List;

@Entity
@Table(name = "school")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Nationalized
    private String schoolName;
    @Nationalized
    private String schoolAddress;

    @OneToMany(mappedBy = "school")
    private List<Student> students;

    @OneToMany(mappedBy = "school")
    private List<Teacher> teachers;

    public School(Long id) {
        this.id = id;
    }

    public School(Long id, String schoolName, String schoolAddress) {
        this.id = id;
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
    }

    public School() {
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
