package com.example.onetomany.inputs;

import com.example.onetomany.models.ClassStudentId;
import com.example.onetomany.models.Student;
import com.example.onetomany.models.Class;

public class ClassStudentDataInput {
    private ClassStudentId classStudentId;
    private Class clazz;
    private Student student;
    private String subject;

    public ClassStudentDataInput() {
    }

    public ClassStudentDataInput(ClassStudentId classStudentId, Class clazz, Student student, String subject) {
        this.classStudentId = classStudentId;
        this.clazz = clazz;
        this.student = student;
        this.subject = subject;
    }

    public ClassStudentId getClassStudentId() {
        return classStudentId;
    }

    public void setClassStudentId(ClassStudentId classStudentId) {
        this.classStudentId = classStudentId;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
