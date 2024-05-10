package com.example.onetomany.outputs;

import com.example.onetomany.models.ClassStudentId;
import com.example.onetomany.models.Student;
import com.example.onetomany.models.Class;

public class ClassStudentDataOutput {
    private ClassStudentId id;
    private Class clazz;
    private Student student;
    private String subject;

    public ClassStudentDataOutput() {
    }

    public ClassStudentDataOutput(ClassStudentId id, Class clazz, Student student, String subject) {
        this.id = id;
        this.clazz = clazz;
        this.student = student;
        this.subject = subject;
    }

    public ClassStudentDataOutput(String subject, ClassStudentId id) {
        this.subject = subject;
        this.id = id;
    }

    public ClassStudentId getId() {
        return id;
    }

    public void setId(ClassStudentId id) {
        this.id = id;
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
