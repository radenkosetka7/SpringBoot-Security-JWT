package com.example.auth.repositories;

import com.example.auth.models.entities.TokenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface TokenRepository extends JpaRepository<TokenEntity, Integer> {

    @Query("SELECT t from TokenEntity t where t.user.id =:id and t.expired=false and t.revoked = false")
    List<TokenEntity> findAllValidTokenByUser(Integer id);

    Optional<TokenEntity> findByToken(String token);
}
