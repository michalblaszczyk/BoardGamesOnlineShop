package com.example.BoardGamesOnlineShop.dto;

import com.example.BoardGamesOnlineShop.model.BoardGame;
import lombok.Data;

@Data
public class OrderProductDto {

    private BoardGame boardGame;
    private Integer quantity;

}
