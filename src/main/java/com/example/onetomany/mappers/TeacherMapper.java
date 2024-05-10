package com.example.onetomany.mappers;

import com.example.onetomany.inputs.TeacherDataInput;
import com.example.onetomany.models.Teacher;
import com.example.onetomany.outputs.TeacherDataOutput;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface TeacherMapper {
    @Mappings({
            @Mapping(target = "id",source = "id"),
            @Mapping(target = "nameTeacher",source = "input.nameTeacher"),
            @Mapping(target = "ageTeacher",source = "input.ageTeacher"),
            @Mapping(target = "school",source = "input.school"),
    })
    Teacher teacherDataInputToTeacher(TeacherDataInput input, Long id);

    @Mappings({
            @Mapping(target = "id",source = "input.id"),
            @Mapping(target = "nameTeacher",source = "input.nameTeacher"),
            @Mapping(target = "ageTeacher",source = "input.ageTeacher"),
            @Mapping(target = "school",source = "input.school"),
    })
    TeacherDataOutput teacherToTeacherDataOutput(Teacher input);
}
