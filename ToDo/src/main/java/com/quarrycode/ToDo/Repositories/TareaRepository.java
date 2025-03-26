package com.quarrycode.ToDo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quarrycode.ToDo.Models.TareaModel;

public interface TareaRepository extends JpaRepository<TareaModel,Long> {

}
