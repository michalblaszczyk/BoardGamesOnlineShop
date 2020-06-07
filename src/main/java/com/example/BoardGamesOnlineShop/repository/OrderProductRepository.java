package com.example.BoardGamesOnlineShop.repository;

import com.example.BoardGamesOnlineShop.model.ProductInOrder;
import com.example.BoardGamesOnlineShop.model.OrderProductPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderProductRepository extends JpaRepository<ProductInOrder, OrderProductPK> {
}
