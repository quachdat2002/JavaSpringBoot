package com.example.onetomany.mappers;

import com.example.onetomany.inputs.ClassDataInput;
import com.example.onetomany.outputs.ClassDataOutput;
import com.example.onetomany.models.Class;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ClassMapper {
    @Mappings({
            @Mapping(target = "id",source = "id"),
            @Mapping(target = "className",source = "input.className"),
            @Mapping(target = "description",source = "input.description")
    })
    Class classDataInputToClass(ClassDataInput input,Long id);

    @Mappings({
            @Mapping(target = "id",source = "input.id"),
            @Mapping(target = "className",source = "input.className"),
            @Mapping(target = "description",source = "input.description"),
    })
    ClassDataOutput classToClassDataOutput(Class input);
}
