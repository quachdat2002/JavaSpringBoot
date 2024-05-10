package com.example.onetomany.services;

import com.example.onetomany.inputs.StudentDataInput;
import com.example.onetomany.models.Student;
import com.example.onetomany.outputs.StudentDataOutput;

import java.util.List;

public interface StudentService {
    Student insertStudent(StudentDataInput input, Long schholId);

    StudentDataOutput deleteStudent( Long id);

    List<StudentDataOutput> getListStudents();
}
