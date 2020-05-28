package com.example.BoardGamesOnlineShop.controller;

import com.example.BoardGamesOnlineShop.model.BoardGame;
import com.example.BoardGamesOnlineShop.model.User;
import com.example.BoardGamesOnlineShop.service.BoardGameService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/boardgames")
public class BoardGamesContoller {
    private BoardGameService boardGameService;

    public BoardGamesContoller(BoardGameService boardGameService) {
        this.boardGameService = boardGameService;
    }

    @GetMapping(value = {"", "/"})
    public List<BoardGame> getBoardGames(){
        return boardGameService.getAllBoardGames();
    }

    @GetMapping(value = "/search/{givenName}")
    public List<BoardGame> findBoardGameByGivenName(@PathVariable(name="givenName")String givenName){
        return boardGameService.getSearchBoardGames(givenName);
    }

    @GetMapping(produces = "application/json")
    @RequestMapping({ "/validateLogin" })
    public User validateLogin() {
        return new User("User successfully authenticated");
    }
}
