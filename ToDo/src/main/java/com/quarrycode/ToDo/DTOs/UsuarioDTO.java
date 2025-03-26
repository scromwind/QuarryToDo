package com.quarrycode.ToDo.DTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {

    @NotBlank(message = "El nombre no puede estar vacio")
    @Size(max=80,message = "El nombre no puede sobrepasar los 80 caracteres")
    private String nombre;

    @NotBlank(message = "El dni no puede estar vacio")
    @Size(max=12,message = "El dni no puede tener mas de 12 caracteres")
    private String dni;

    @NotBlank(message = "La contraseña no puede estar vacia")
    @Size(min = 4, max = 20,message = "la contraseña debe contener minimo 4 caracteres y maximo de 20 caracteres")
    private String contraseña;

}
