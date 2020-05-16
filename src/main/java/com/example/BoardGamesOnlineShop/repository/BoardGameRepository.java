package com.example.BoardGamesOnlineShop.repository;

import com.example.BoardGamesOnlineShop.model.BoardGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardGameRepository extends JpaRepository<BoardGame, Long> {
    @Query(value = "SELECT * FROM boardgame b WHERE LOWER(b.name) = LOWER(:givenName)", nativeQuery = true)
    List<BoardGame> findBoardGameByName(@Param("givenName") String givenName);
}
