package com.quarrycode.ToDo.Mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.quarrycode.ToDo.DTOs.TareaDto;
import com.quarrycode.ToDo.Models.TareaModel;

@Mapper(componentModel = "spring")
public interface TareaMapper {

    @Mapping(target = "createdAT",ignore = true)
    @Mapping(target = "usuario",ignore = true)
    public TareaModel ConvertirAEntidad (TareaDto tarea);
}
