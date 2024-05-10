package com.example.onetomany.mappers;

import com.example.onetomany.inputs.ClassDataInput;
import com.example.onetomany.inputs.ClassStudentDataInput;
import com.example.onetomany.models.ClassStudent;
import com.example.onetomany.models.ClassStudentId;
import com.example.onetomany.models.Student;
import com.example.onetomany.outputs.ClassDataOutput;
import com.example.onetomany.outputs.ClassStudentDataOutput;
import com.example.onetomany.models.Class;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface ClassStudentMapper {
    @Mappings({
            @Mapping(target = "clazz",source = "clazz"),
            @Mapping(target = "student",source = "student"),
            @Mapping(target = "subject",source = "input.subject"),
    })
    ClassStudent inputToClassStudent(ClassStudentDataInput input, Class clazz, Student student);

    @Mappings({
            @Mapping(target = "clazz",source = "input.clazz"),
            @Mapping(target = "student",source = "input.student"),
            @Mapping(target = "subject",source = "input.subject"),
    })
    ClassStudentDataOutput classStudentToOutput(ClassStudent input);
}
