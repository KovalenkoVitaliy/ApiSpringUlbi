package com.example.ApiSpringUlbi.repository;

import com.example.ApiSpringUlbi.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserEntity, Long> {
    UserEntity findByUsername(String username);
}
