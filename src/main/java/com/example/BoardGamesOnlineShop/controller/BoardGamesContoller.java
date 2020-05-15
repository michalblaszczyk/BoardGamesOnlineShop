package com.example.BoardGamesOnlineShop.controller;

import com.example.BoardGamesOnlineShop.model.BoardGame;
import com.example.BoardGamesOnlineShop.service.BoardGameService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class BoardGamesContoller {
    private BoardGameService boardGameService;

    public BoardGamesContoller(BoardGameService boardGameService) {
        this.boardGameService = boardGameService;
    }

    @GetMapping(value = {"", "/"})
    public List<BoardGame> getBoardGames(){
        return boardGameService.getAllBoardGames();
    }
}
