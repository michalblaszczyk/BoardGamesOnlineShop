package com.example.BoardGamesOnlineShop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestContoller {

    @GetMapping("/test")
    public String hello(){
        return "Print test contoller string!!!";
    }
}
