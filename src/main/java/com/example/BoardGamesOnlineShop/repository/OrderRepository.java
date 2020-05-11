package com.example.BoardGamesOnlineShop.repository;

import com.example.BoardGamesOnlineShop.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
