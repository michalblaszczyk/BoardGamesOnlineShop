package com.example.BoardGamesOnlineShop.service;

import com.example.BoardGamesOnlineShop.exception.ResourceNotFoundException;
import com.example.BoardGamesOnlineShop.model.BoardGame;
import com.example.BoardGamesOnlineShop.repository.BoardGameRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoardGameService {
    private final BoardGameRepository boardGameRepository;

    public BoardGameService(BoardGameRepository boardGameRepository) {
        this.boardGameRepository = boardGameRepository;
    }

    public BoardGame getBoardGame(Long id) throws ResourceNotFoundException {
        return boardGameRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product not found"));
    }

    public List<BoardGame> getAllBoardGames(){
        return boardGameRepository.findAll();
    }

    public List<BoardGame> getSearchBoardGames(String givenName){
        return boardGameRepository.findBoardGameByName(givenName);
    }

    public Optional<BoardGame> findById(Long id) throws ResourceNotFoundException{
        BoardGame boardGame = boardGameRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("City not found for this id: " + id));
        return boardGameRepository.findById(id);
    }

    public BoardGame save(BoardGame boardGame){
        return boardGameRepository.save(boardGame);
    }

    public BoardGame update(Long id, BoardGame boardGame) throws ResourceNotFoundException{
        BoardGame bg = boardGameRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("City not found for this id: " + id));
        bg.setName(boardGame.getName());
        bg.setPrice(boardGame.getPrice());
        bg.setPictureUrl(boardGame.getPictureUrl());

        final BoardGame boardGameUpdated = boardGameRepository.save(bg);
        return boardGameUpdated;
    }

    public BoardGame deleteById(Long id) throws ResourceNotFoundException{
        BoardGame boardGame = boardGameRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("City not found for this id: " + id));
        boardGameRepository.deleteById(id);
        return boardGame;
    }
}
