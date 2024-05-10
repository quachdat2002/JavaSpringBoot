package com.example.onetomany.outputs;

import com.example.onetomany.models.School;

public class TeacherDataOutput {
    private Long id;
    private String nameTeacher;
    private String ageTeacher;
    private School school;

    public TeacherDataOutput() {
    }

    public TeacherDataOutput(Long id, String nameTeacher, String ageTeacher, School school) {
        this.id = id;
        this.nameTeacher = nameTeacher;
        this.ageTeacher = ageTeacher;
        this.school = school;
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

    public String getAgeTeacher() {
        return ageTeacher;
    }

    public void setAgeTeacher(String ageTeacher) {
        this.ageTeacher = ageTeacher;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}
