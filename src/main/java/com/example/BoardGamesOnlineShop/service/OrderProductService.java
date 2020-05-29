package com.example.BoardGamesOnlineShop.service;

import com.example.BoardGamesOnlineShop.model.OrderProduct;
import com.example.BoardGamesOnlineShop.repository.OrderProductRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderProductService {

    private OrderProductRepository orderProductRepository;

    public OrderProductService(OrderProductRepository orderProductRepository) {
        this.orderProductRepository = orderProductRepository;
    }

    public OrderProduct create(OrderProduct orderProduct){
        return this.orderProductRepository.save(orderProduct);
    }
}
