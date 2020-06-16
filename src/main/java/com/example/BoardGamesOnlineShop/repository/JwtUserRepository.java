package com.example.BoardGamesOnlineShop.repository;

import com.example.BoardGamesOnlineShop.model.JwtUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JwtUserRepository extends JpaRepository<JwtUser, Long> {
    Optional<JwtUser> findByUsername(String username);
    Boolean existsByUsername(String username);
}
