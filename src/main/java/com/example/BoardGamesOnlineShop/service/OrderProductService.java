package com.example.BoardGamesOnlineShop.service;

import com.example.BoardGamesOnlineShop.model.ProductInOrder;
import com.example.BoardGamesOnlineShop.repository.OrderProductRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderProductService {

    private OrderProductRepository orderProductRepository;

    public OrderProductService(OrderProductRepository orderProductRepository) {
        this.orderProductRepository = orderProductRepository;
    }

    public ProductInOrder create(ProductInOrder productInOrder){
        return this.orderProductRepository.save(productInOrder);
    }
}
