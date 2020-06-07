package com.example.BoardGamesOnlineShop.controller;

import com.example.BoardGamesOnlineShop.model.Users;
import com.example.BoardGamesOnlineShop.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/users")
public class UserContoller {

    private UserRepository userRepository;

    public UserContoller(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<Users> getUsers(){
        return userRepository.findAll();
    }

    @PostMapping
    public void createUser(@RequestBody Users user){
        userRepository.save(user);
    }

    @DeleteMapping(path={"/{id}"})
    public Optional<Users> deleteUser(@PathVariable("id") Long id){
        Optional<Users> user = userRepository.findById(id);
        userRepository.deleteById(id);
        return user;
    }

//    @PostMapping("/boardgame")
//    public ResponseEntity create(@Valid @RequestBody BoardGame boardGame){
//        return ResponseEntity.ok(boardGameService.save(boardGame));
//    }
}
