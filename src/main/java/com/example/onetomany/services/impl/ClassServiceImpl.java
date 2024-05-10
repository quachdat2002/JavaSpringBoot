package com.example.onetomany.services.impl;

import com.example.onetomany.inputs.ClassDataInput;
import com.example.onetomany.mappers.ClassMapper;
import com.example.onetomany.outputs.ClassDataOutput;
import com.example.onetomany.repositories.ClassRepository;
import com.example.onetomany.services.ClassService;
import org.springframework.stereotype.Service;
import com.example.onetomany.models.Class;

@Service
public class ClassServiceImpl implements ClassService {
    private final ClassRepository classRepository;
    private final ClassMapper classMapper;

    public ClassServiceImpl(ClassRepository classRepository, ClassMapper classMapper) {
        this.classRepository = classRepository;
        this.classMapper = classMapper;
    }


    @Override
    public ClassDataOutput insertClass(ClassDataInput input) {
        Class cla = classMapper.classDataInputToClass(input,null);
        classRepository.save(cla);
        return classMapper.classToClassDataOutput(cla);
    }
}
