package com.example.onetomany.inputs;

import com.example.onetomany.models.School;

public class StudentDataInput {
    private Long id;
    private String nameStudent;
    private String ageStudent;
    private School school;

    public StudentDataInput() {
    }

    public StudentDataInput(Long id, String nameStudent, String ageStudent, School school) {
        this.id = id;
        this.nameStudent = nameStudent;
        this.ageStudent = ageStudent;
        this.school = school;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
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
