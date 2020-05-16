package com.example.BoardGamesOnlineShop.controller;

import com.example.BoardGamesOnlineShop.model.BoardGame;
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

    @RequestMapping(value = "/search/{givenName}", method = RequestMethod.GET)
    public List<BoardGame> findBoardGameByGivenName(@PathVariable(name="givenName")String givenName){
        return boardGameService.getSearchBoardGames(givenName);
    }
}
