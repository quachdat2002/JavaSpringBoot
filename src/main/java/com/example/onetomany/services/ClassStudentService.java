package com.example.onetomany.services;

import com.example.onetomany.inputs.ClassStudentDataInput;
import com.example.onetomany.models.ClassStudent;
import com.example.onetomany.models.ClassStudentId;
import com.example.onetomany.models.Student;
import com.example.onetomany.outputs.ClassStudentDataOutput;
import com.example.onetomany.models.Class;

public interface ClassStudentService {
    ClassStudentDataOutput addClassStudent(ClassStudentDataInput input, Long studentId, Long classId);
}
