package com.quarrycode.ToDo.Models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class TareaModel {
    private Long id;
    private String titulo;
    private String descripcion;
    private Boolean finalizada;
    private LocalDateTime createdAT;
}
