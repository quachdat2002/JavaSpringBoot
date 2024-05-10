package com.example.onetomany.services;

import com.example.onetomany.inputs.ClassDataInput;
import com.example.onetomany.outputs.ClassDataOutput;

public interface ClassService {
    ClassDataOutput insertClass(ClassDataInput input);
}
