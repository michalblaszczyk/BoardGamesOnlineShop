package com.example.BoardGamesOnlineShop.form;

import com.example.BoardGamesOnlineShop.dto.OrderProductDto;
import lombok.Data;

import java.util.List;

@Data
public class OrderForm {
    List<OrderProductDto> productOrdes;
}
