package com.example.BoardGamesOnlineShop.form;

import com.example.BoardGamesOnlineShop.dto.OrderProductDto;
import com.example.BoardGamesOnlineShop.model.OrderProduct;
import lombok.Data;

import java.util.List;

@Data
public class OrderForm {
    List<OrderProductDto> productOrdes;
}
