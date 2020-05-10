package com.example.BoardGamesOnlineShop.repository;

import com.example.BoardGamesOnlineShop.model.BoardGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardGameRepository extends JpaRepository<BoardGame, Long> {

}
