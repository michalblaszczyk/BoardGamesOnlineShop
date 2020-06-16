package com.example.BoardGamesOnlineShop.repository;

import com.example.BoardGamesOnlineShop.model.ERole;
import com.example.BoardGamesOnlineShop.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.authentication.jaas.JaasPasswordCallbackHandler;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
