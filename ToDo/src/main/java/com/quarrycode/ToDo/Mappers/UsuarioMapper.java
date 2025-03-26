package com.quarrycode.ToDo.Mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.quarrycode.ToDo.DTOs.UsuarioDTO;
import com.quarrycode.ToDo.Models.UsuarioModel;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {
    
    public UsuarioDTO ConvertirADto(UsuarioModel usuario);

    @Mapping(target = "tareas",ignore = true)
    @Mapping(target = "createdAT",ignore = true)
    @Mapping(target = "id",ignore = true)
    public UsuarioModel ConvertirAEntidad(UsuarioDTO usuario);

    public List<UsuarioDTO> ConvertirlistaDto(List<UsuarioModel> usuarios);
}
