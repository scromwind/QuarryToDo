package com.quarrycode.ToDo.DTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TareaDto {

    private Long id;

    @NotBlank(message = "No se puede crear una tarjeta sin un titulo")
    @Size(max = 45,message = "El titulo no puede tener mas de 45 caracteres")
    private String titulo;

    @Size(max = 250, message = "La descripcion no puede tener mas de 250 caracteres")
    private String descripcion;

    private Boolean finalizada;

}
