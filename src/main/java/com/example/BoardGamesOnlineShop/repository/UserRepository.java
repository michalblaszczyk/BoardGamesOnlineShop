package com.example.BoardGamesOnlineShop.repository;

import com.example.BoardGamesOnlineShop.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
}
