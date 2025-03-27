package com.quarrycode.ToDo.Services.Implements;

import java.util.List;

import org.springframework.stereotype.Service;

import com.quarrycode.ToDo.DTOs.TareaDto;
import com.quarrycode.ToDo.Mappers.TareaMapper;
import com.quarrycode.ToDo.Models.TareaModel;
import com.quarrycode.ToDo.Repositories.TareaRepository;
import com.quarrycode.ToDo.Services.TareaService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor //esta anotacion implementa el constructor que inyecta las dependencias de los atributos de tipo final
@Service
public class TareaServiceImp implements TareaService {

    private final TareaRepository tareaRepository; //@RequieredArgsContructor
    private final TareaMapper tareaMapper; //@RequieredArgsContructor

    @Override
    public TareaDto CrearTarea(TareaDto tareaDTO) {
        TareaModel tarea = tareaMapper.ConvertirAEntidad(tareaDTO);
        tarea = tareaRepository.save(tarea);
        return tareaMapper.ConvetirADto(tarea);
    }

    @Override
    public List<TareaDto> ListarTareas() {
        List<TareaModel> tareas = tareaRepository.findAll();
        return tareaMapper.ConvetirADto(tareas);
    }

}
