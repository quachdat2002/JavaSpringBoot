package com.example.onetomany.controllers;

import com.example.onetomany.inputs.TeacherDataInput;
import com.example.onetomany.models.Teacher;
import com.example.onetomany.outputs.TeacherDataOutput;
import com.example.onetomany.services.TeacherService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TeacherController {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping("/insert-teacher/{schoolId}")
    public ResponseEntity<?> insertTeacher(@Valid @RequestBody TeacherDataInput input, @PathVariable("schoolId") Long schoolId) {
        TeacherDataOutput output = teacherService.insertTeacher(input,schoolId);
        return ResponseEntity.ok(output);
    }

    @DeleteMapping("/delete-teacher/{id}")
    public ResponseEntity<?> deleteTeacher(@PathVariable("id") Long id) {
        TeacherDataOutput output = teacherService.deleteTeacher(id);
        return ResponseEntity.ok(output);
    }


}
