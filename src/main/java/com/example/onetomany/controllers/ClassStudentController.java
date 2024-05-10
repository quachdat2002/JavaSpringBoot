package com.example.onetomany.controllers;

import com.example.onetomany.inputs.ClassStudentDataInput;
import com.example.onetomany.models.ClassStudent;
import com.example.onetomany.models.ClassStudentId;
import com.example.onetomany.outputs.ClassStudentDataOutput;
import com.example.onetomany.services.ClassStudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ClassStudentController {
    private final ClassStudentService classStudentService;


    public ClassStudentController(ClassStudentService classStudentService) {
        this.classStudentService = classStudentService;
    }

    @PostMapping("/insert-class-student/{classId}/{studentId}")
    public ResponseEntity<?> addClassStudent(@RequestBody ClassStudentDataInput input,@PathVariable("classId") Long classId,@PathVariable("studentId") Long studentId) {
        ClassStudentDataOutput output = classStudentService.addClassStudent(input, studentId,classId);
        return ResponseEntity.ok(output);
    }
}
