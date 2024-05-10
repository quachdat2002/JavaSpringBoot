package com.example.onetomany.services.impl;

import com.example.onetomany.inputs.TeacherDataInput;
import com.example.onetomany.mappers.TeacherMapper;
import com.example.onetomany.models.School;
import com.example.onetomany.models.Teacher;
import com.example.onetomany.outputs.TeacherDataOutput;
import com.example.onetomany.repositories.SchoolRepository;
import com.example.onetomany.repositories.TeacherRepository;
import com.example.onetomany.services.TeacherService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeacherServiceImpl implements TeacherService {
    private final TeacherRepository teacherRepository;
    private final TeacherMapper teacherMapper;
    private final SchoolRepository schoolRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository, TeacherMapper teacherMapper, SchoolRepository schoolRepository) {
        this.teacherRepository = teacherRepository;
        this.teacherMapper = teacherMapper;
        this.schoolRepository = schoolRepository;
    }


    @Override
    public TeacherDataOutput insertTeacher(TeacherDataInput input,Long schoolId) {
        Optional<School> school = schoolRepository.findById(schoolId);
        if (school.isEmpty()) {
            return null;
        }
        Teacher teacher = teacherMapper.teacherDataInputToTeacher(input,null);
        teacher.setSchool(school.get());
        teacherRepository.save(teacher);
        return teacherMapper.teacherToTeacherDataOutput(teacher);
    }

    @Override
    public TeacherDataOutput deleteTeacher(Long id) {
        Optional<Teacher> teacher = teacherRepository.findById(id);
        if (teacher.isEmpty()) {
            return null;
        }
        teacherRepository.deleteById(id);
        return new TeacherDataOutput(teacher.get().getId(),teacher.get().getNameTeacher(),teacher.get().getNameTeacher(),teacher.get().getSchool());
    }
}
