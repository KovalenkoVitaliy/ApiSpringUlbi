package com.example.ApiSpringUlbi.repository;

import com.example.ApiSpringUlbi.entity.TodoEntity;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepo extends CrudRepository<TodoEntity, Long> {
}
