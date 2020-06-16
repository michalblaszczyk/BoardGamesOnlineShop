package com.example.BoardGamesOnlineShop.controller;

import com.example.BoardGamesOnlineShop.model.JwtUser;
import com.example.BoardGamesOnlineShop.model.Users;
import com.example.BoardGamesOnlineShop.repository.JwtUserRepository;
import com.example.BoardGamesOnlineShop.repository.UserRepository;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//@PreAuthorize("hasRole('ADMIN')")
@RestController
@RequestMapping(path = "/api/admin")
public class UserContoller {

    private JwtUserRepository jwtUserRepository;

    public UserContoller(JwtUserRepository userRepository) {
        this.jwtUserRepository = userRepository;
    }

    @GetMapping
    public List<JwtUser> getUsers(){
        return jwtUserRepository.findAll();
    }

    @PostMapping
    public void createUser(@RequestBody JwtUser user){
        jwtUserRepository.save(user);
    }

    @DeleteMapping(path={"/{id}"})
    public Optional<JwtUser> deleteUser(@PathVariable("id") Long id){
        Optional<JwtUser> user = jwtUserRepository.findById(id);
        jwtUserRepository.deleteById(id);
        return user;
    }
}
