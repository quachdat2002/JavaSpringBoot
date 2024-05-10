package com.example.onetomany.services.impl;

import com.example.onetomany.exceptions.NotFoundException;
import com.example.onetomany.inputs.SchoolDataInput;
import com.example.onetomany.mappers.SchoolMapper;
import com.example.onetomany.models.School;
import com.example.onetomany.outputs.SchoolDataOutput;
import com.example.onetomany.repositories.SchoolRepository;
import com.example.onetomany.services.SchoolService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SchoolServiceImpl implements SchoolService {
    private final SchoolRepository schoolRepository;
    private final SchoolMapper schoolMapper;

    public SchoolServiceImpl(SchoolRepository schoolRepository, SchoolMapper schoolMapper) {
        this.schoolRepository = schoolRepository;
        this.schoolMapper = schoolMapper;
    }


    @Override
    public SchoolDataOutput insertSchool(SchoolDataInput input) {
        School school2 = schoolMapper.schoolDataInputToSchool(input,null);
        schoolRepository.save(school2);
        return schoolMapper.schoolToSchoolOutput(school2);
    }

    @Override
    public SchoolDataOutput getSchoolById(Long id) {
        Optional<School> school = schoolRepository.findById(id);
        if(school.isEmpty()) {
            //return null;
            throw new NotFoundException("School not found");
        }
        return new SchoolDataOutput(school.get().getId(),school.get().getSchoolName(),school.get().getSchoolAddress());
    }

    @Override
    public SchoolDataOutput deleteSchoolById(Long id) {
        Optional<School> school = schoolRepository.findById(id);
        if(school.isEmpty()) {
            return null;
        }
        schoolRepository.deleteById(id);
        return new SchoolDataOutput(school.get().getId(),school.get().getSchoolName(),school.get().getSchoolAddress());
    }

    @Override
    public SchoolDataOutput updateSchool(SchoolDataInput input, Long id) {
        Optional<School> school = schoolRepository.findById(id);
        if(school.isEmpty()) {
            return null;
        }
        School schoolSaved = schoolMapper.schoolDataInputToSchool(input,id);
        schoolRepository.save(schoolSaved);
        return schoolMapper.schoolToSchoolOutput(schoolSaved);
    }
}
