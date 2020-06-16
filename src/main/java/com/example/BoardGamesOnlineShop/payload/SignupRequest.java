package com.example.BoardGamesOnlineShop.payload;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

@Data
public class SignupRequest {
    private String username;
    private Set<String> role;
    private String password;
}
