package com.quarrycode.ToDo.Services;

import java.util.List;

import com.quarrycode.ToDo.DTOs.TareaDto;

public interface TareaService {
    TareaDto CrearTarea(TareaDto tareadDTO);
    List<TareaDto> ListarTareas();
}
 