package com.example.auth.repositories;

import com.example.auth.models.entities.UserEntity;
import com.example.auth.models.enums.UserStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    Optional<UserEntity> findByEmail(String email);

    Optional<UserEntity> findByUsername(String username);

    Optional<UserEntity> findByUsernameAndStatus(String username, UserStatus status);
}
