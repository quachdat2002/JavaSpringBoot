package com.example.onetomany.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.Nationalized;

import java.util.List;

@Entity
@Table(name = "classes")
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Nationalized
    private String className;
    @Nationalized
    private String description;

    @OneToMany(mappedBy = "clazz")
    @JsonIgnore
    private List<ClassStudent> classStudent;

    public Class() {
    }

    public Class(Long id, String className, String description, List<ClassStudent> classStudent) {
        this.id = id;
        this.className = className;
        this.description = description;
        this.classStudent = classStudent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ClassStudent> getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(List<ClassStudent> classStudent) {
        this.classStudent = classStudent;
    }
}
