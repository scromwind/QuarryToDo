package com.quarrycode.ToDo.Controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quarrycode.ToDo.DTOs.TareaDto;
import com.quarrycode.ToDo.Services.Implements.TareaServiceImp;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/tareas")
@RequiredArgsConstructor
public class TareaController {

    final private TareaServiceImp tareaService;

    @GetMapping
    public ResponseEntity<List<TareaDto>> listarTareas(){
        List<TareaDto> tareas = tareaService.ListarTareas();
        return ResponseEntity.ok(tareas);
    }

    @PostMapping
    public ResponseEntity<TareaDto> crearTarea(@RequestBody TareaDto tareaDto){
        TareaDto nuevaTarea = tareaService.CrearTarea(tareaDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevaTarea);
    }
}
