package com.example.BoardGamesOnlineShop.repository;

import com.example.BoardGamesOnlineShop.model.OrderProduct;
import com.example.BoardGamesOnlineShop.model.OrderProductPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderProductRepository extends JpaRepository<OrderProduct, OrderProductPK> {
}
