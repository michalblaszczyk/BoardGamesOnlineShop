package com.example.BoardGamesOnlineShop.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Transient;

@Data
@Entity
public class OrderProduct {
    @EmbeddedId
    @JsonIgnore
    private OrderProductPK pk;

    @Column(nullable = false)
    private Integer quantity;


    public OrderProduct(Order order, BoardGame boardGame, Integer quantity){
        pk = new OrderProductPK();
        pk.setOrder(order);
        pk.setBoardGame(boardGame);
        this.quantity = quantity;
    }

    @Transient
    public BoardGame getBoardGame(){
        return this.pk.getBoardGame();
    }

    @Transient Double getTotalPrice() {
        return  getBoardGame().getPrice() * getQuantity();
    }

}
