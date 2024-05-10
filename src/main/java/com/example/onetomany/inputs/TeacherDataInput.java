package com.example.onetomany.inputs;

import com.example.onetomany.models.School;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class TeacherDataInput {
    private Long id;
    @Email(message = "khong dung dinh dang email")
    @NotBlank(message = "khong duoc de trong ")
    private String nameTeacher;
    @NotBlank(message = "khong duoc de trong ")
    private String ageTeacher;
    private School school;

    public TeacherDataInput() {
    }

    public TeacherDataInput(Long id, String nameTeacher, String ageTeacher, School school) {
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
