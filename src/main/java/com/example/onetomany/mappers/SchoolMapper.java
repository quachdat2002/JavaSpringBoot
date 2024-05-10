package com.example.onetomany.mappers;

import com.example.onetomany.inputs.SchoolDataInput;
import com.example.onetomany.models.School;
import com.example.onetomany.outputs.SchoolDataOutput;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface SchoolMapper {
    @Mappings({
            @Mapping(target = "id",source = "id"),
            @Mapping(target = "schoolName",source = "school.schoolName"),
            @Mapping(target = "schoolAddress",source = "school.schoolAddress"),
    })
    School schoolDataInputToSchool(SchoolDataInput school, Long id);

    @Mappings({
            @Mapping(target = "id",source = "school.id"),
            @Mapping(target = "schoolName",source = "school.schoolName"),
            @Mapping(target = "schoolAddress",source = "school.schoolAddress"),
    })
    SchoolDataOutput schoolToSchoolOutput(School school);
}
