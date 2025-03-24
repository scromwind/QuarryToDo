package com.quarrycode.ToDo.Models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class UsuarioModel {
    private Long id;
    private String nombre;
    private String dni;
    private String contraseña;
    private LocalDateTime createdAT;
}
