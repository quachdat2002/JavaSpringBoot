package com.example.onetomany.mappers;

import com.example.onetomany.inputs.StudentDataInput;
import com.example.onetomany.models.Student;
import com.example.onetomany.outputs.StudentDataOutput;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    @Mappings({
            @Mapping(target = "id",source = "id"),
            @Mapping(target = "nameStudent",source = "input.nameStudent"),
            @Mapping(target = "ageStudent",source = "input.ageStudent"),
            @Mapping(target = "school",source = "input.school")
    })
    Student studentDataInputToStudent(StudentDataInput input,Long id);

    @Mappings({
            @Mapping(target = "id",source = "input.id"),
            @Mapping(target = "nameStudent",source = "input.nameStudent"),
            @Mapping(target = "ageStudent",source = "input.ageStudent"),
            @Mapping(target = "school",source = "input.school")
    })
    StudentDataOutput studentToStudentDataOutput(Student input);
}
