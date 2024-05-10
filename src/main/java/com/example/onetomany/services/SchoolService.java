package com.example.onetomany.services;

import com.example.onetomany.inputs.SchoolDataInput;
import com.example.onetomany.models.School;
import com.example.onetomany.outputs.SchoolDataOutput;

public interface SchoolService {
    SchoolDataOutput insertSchool(SchoolDataInput school);

    SchoolDataOutput getSchoolById(Long id);

    SchoolDataOutput deleteSchoolById(Long id);

    SchoolDataOutput updateSchool(SchoolDataInput input, Long id);
}
