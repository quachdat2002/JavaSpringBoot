package com.example.onetomany.controllers;

import com.example.onetomany.inputs.ClassDataInput;
import com.example.onetomany.outputs.ClassDataOutput;
import com.example.onetomany.services.ClassService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ClassController {
    private final ClassService classService;

    public ClassController(ClassService classService) {
        this.classService = classService;
    }

    @PostMapping("/insert-class")
    public ResponseEntity<?> insertClass(@RequestBody ClassDataInput input) {
        ClassDataOutput output = classService.insertClass(input);
        return ResponseEntity.ok(output);
    }
}
