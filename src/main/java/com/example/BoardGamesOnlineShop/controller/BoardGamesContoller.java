package com.example.BoardGamesOnlineShop.controller;

import com.example.BoardGamesOnlineShop.exception.ResourceNotFoundException;
import com.example.BoardGamesOnlineShop.model.BoardGame;
import com.example.BoardGamesOnlineShop.service.BoardGameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/boardgames")
public class BoardGamesContoller {
    private BoardGameService boardGameService;

    public BoardGamesContoller(BoardGameService boardGameService) {
        this.boardGameService = boardGameService;
    }

    @GetMapping
    public List<BoardGame> getBoardGames(){
        return boardGameService.getAllBoardGames();
    }

    @GetMapping(value = "/search/{givenName}")
    public List<BoardGame> findBoardGameByGivenName(@PathVariable(name="givenName")String givenName){
        return boardGameService.getSearchBoardGames(givenName);
    }

    @PostMapping
    public ResponseEntity create(@Valid @RequestBody BoardGame boardGame){
        return ResponseEntity.ok(boardGameService.save(boardGame));
    }

    @DeleteMapping(path = {"/{id}"})
    public ResponseEntity deleteProduct(@PathVariable("id") Long id) throws ResourceNotFoundException {
        BoardGame boardGame = boardGameService.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
