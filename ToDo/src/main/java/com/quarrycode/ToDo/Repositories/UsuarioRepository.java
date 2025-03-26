package com.quarrycode.ToDo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quarrycode.ToDo.Models.UsuarioModel;

public interface UsuarioRepository extends JpaRepository<UsuarioModel,Long> {

}
