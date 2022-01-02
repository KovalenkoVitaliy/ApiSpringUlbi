package com.example.ApiSpringUlbi.service;

import com.example.ApiSpringUlbi.entity.TodoEntity;
import com.example.ApiSpringUlbi.entity.UserEntity;
import com.example.ApiSpringUlbi.model.Todo;
import com.example.ApiSpringUlbi.repository.TodoRepo;
import com.example.ApiSpringUlbi.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoRepo todoRepo;

    @Autowired
    private UserRepo userRepo;

    public Todo createTodo(TodoEntity todo, Long userid){
        UserEntity user = userRepo.findById(userid).get();
        todo.setUser(user);
        return Todo.toModel(todoRepo.save(todo));
    }

    public Todo complete(Long id){
        TodoEntity todo = todoRepo.findById(id).get();
        todo.setCompleted(!todo.getCompleted());
        return Todo.toModel(todoRepo.save(todo));
    }
    
}
