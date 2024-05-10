package com.example.onetomany.services;

import com.example.onetomany.inputs.TeacherDataInput;
import com.example.onetomany.outputs.TeacherDataOutput;

public interface TeacherService {
    TeacherDataOutput insertTeacher(TeacherDataInput input, Long schoolId);

    TeacherDataOutput deleteTeacher(Long id);
}
