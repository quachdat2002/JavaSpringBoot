package com.example.onetomany.controllers;

import com.example.onetomany.utils.ResponseUtil;
import com.example.onetomany.inputs.SchoolDataInput;
import com.example.onetomany.outputs.SchoolDataOutput;
import com.example.onetomany.services.SchoolService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SchoolController {
    private final SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @PostMapping("/insert-school")
    public ResponseEntity<?> insertSchool(@RequestBody SchoolDataInput input) {
        SchoolDataOutput output = schoolService.insertSchool(input);
        return ResponseEntity.ok(output);
    }

    @GetMapping("/get-schoolid/{id}")
    public ResponseEntity<?> getSchoolById(@PathVariable("id") Long id) {
        SchoolDataOutput output = schoolService.getSchoolById(id);
        return ResponseUtil.restSuccess(output);
    }

    @DeleteMapping("/delete-school/{id}")
    public ResponseEntity<?> deleteSchoolById(@PathVariable("id") Long id) {
        SchoolDataOutput output = schoolService.deleteSchoolById(id);
        return ResponseEntity.ok(output);
    }

    @PutMapping("/update-school/{id}")
    public ResponseEntity<?> updateSchool(@RequestBody SchoolDataInput input, @PathVariable("id") Long id) {
        SchoolDataOutput output = schoolService.updateSchool(input, id);
        return ResponseEntity.ok(output);
    }

}
