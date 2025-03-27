package com.quarrycode.ToDo.Mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.quarrycode.ToDo.DTOs.TareaDto;
import com.quarrycode.ToDo.Models.TareaModel;

@Mapper(componentModel = "spring")
public interface TareaMapper {

    @Mapping(target = "createdAT",ignore = true)
    public TareaModel ConvertirAEntidad (TareaDto tarea);

    public TareaDto ConvetirADto(TareaModel tareaModel);

    public List<TareaDto> ConvetirADto(List<TareaModel> tareasModel);
}
