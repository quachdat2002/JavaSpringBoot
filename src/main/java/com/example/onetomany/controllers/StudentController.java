package com.example.onetomany.controllers;

import com.example.onetomany.utils.ResponseUtil;
import com.example.onetomany.inputs.StudentDataInput;
import com.example.onetomany.models.Student;
import com.example.onetomany.outputs.StudentDataOutput;
import com.example.onetomany.services.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
    private final StudentService studentService;


    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/insert-student/{schoolId}")
    public ResponseEntity<?> insertStudent(@RequestBody StudentDataInput input, @PathVariable("schoolId") Long schoolId) {
        Student output = studentService.insertStudent(input,schoolId);
        return ResponseUtil.restSuccess(output);
    }

    @DeleteMapping("/delete-student/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable("id") Long id) {
        StudentDataOutput output = studentService.deleteStudent( id);
        return ResponseEntity.ok(output);
    }

    @GetMapping("/get-students")
    public ResponseEntity<?> getAllStudents() {
        List<StudentDataOutput> output = studentService.getListStudents();
        return ResponseEntity.ok(output);
    }
}
