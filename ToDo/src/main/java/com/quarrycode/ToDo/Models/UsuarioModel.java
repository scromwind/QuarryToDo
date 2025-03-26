package com.quarrycode.ToDo.Models;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 80,nullable = false)
    private String nombre;

    @Column(length = 12,nullable = false,unique = true)
    private String dni;

    @Column(length = 20,nullable = false)
    private String contraseña;

    @CreationTimestamp
    private LocalDateTime createdAT;

    @OneToMany(mappedBy = "usuario",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<TareaModel> tareas;
}
