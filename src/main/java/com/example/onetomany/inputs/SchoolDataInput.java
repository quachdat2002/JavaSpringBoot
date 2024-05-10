package com.example.onetomany.inputs;

import com.example.onetomany.models.Student;
import com.example.onetomany.models.Teacher;

import java.util.List;

public class SchoolDataInput {
    private Long id;
    private String schoolName;
    private String schoolAddress;

    public SchoolDataInput() {
    }


    public SchoolDataInput(Long id, String schoolName, String schoolAddress) {
        this.id = id;
        this.schoolName = schoolName;
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

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }
}
