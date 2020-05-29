package com.example.BoardGamesOnlineShop.controller;

import com.example.BoardGamesOnlineShop.service.BoardGameService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class BoardGameController {
    private final BoardGameService boardGameService;

//    @GetMapping("/boardgame")
//    public ResponseEntity<List<BoardGame>> findAll(){
//        return ResponseEntity.ok(boardGameService.findAll());
//    }

//    @PutMapping("/boardgame/{id}")
//    public ResponseEntity<BoardGame> update(@PathVariable Long id, @Valid @RequestBody BoardGame boardGame) throws ResourceNotFoundException {
//        return ResponseEntity.ok(boardGameService.update(id,boardGame));
//    }
//
//    @GetMapping("/boardgame/{id}")
//    public ResponseEntity<Optional<BoardGame>> findById(@PathVariable Long id) throws ResourceNotFoundException {
//        return ResponseEntity.ok(boardGameService.findById(id));
//    }
//
//    @PostMapping("/boardgame")
//    public ResponseEntity create(@Valid @RequestBody BoardGame boardGame){
//        return ResponseEntity.ok(boardGameService.save(boardGame));
//    }
//
//    @DeleteMapping("/boardgame/{id}")
//    public ResponseEntity<Object> delete(@PathVariable Long id) throws ResourceNotFoundException {
//        boardGameService.deleteById(id);
//        return ResponseEntity.ok().build();
//    }
}
