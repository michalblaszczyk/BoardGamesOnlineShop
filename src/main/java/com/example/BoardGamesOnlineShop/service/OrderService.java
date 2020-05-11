package com.example.BoardGamesOnlineShop.service;

import com.example.BoardGamesOnlineShop.model.Order;
import com.example.BoardGamesOnlineShop.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
  private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Iterable<Order> getAllOrders(){
        return this.orderRepository.findAll();
    }

    public Order create(Order order){
        return this.orderRepository.save(order);
    }

    public void  update(Order order){
         this.orderRepository.save(order);
    }
}
