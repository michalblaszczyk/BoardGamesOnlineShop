package com.example.BoardGamesOnlineShop.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;

    @JsonManagedReference
    @OneToMany(mappedBy = "pk.order")
    @Valid
    private List<OrderProduct> orderProducts = new ArrayList<OrderProduct>();

    @Transient
    public Double getTotalOrderPrice(){
        double sum = 0;
        List<OrderProduct> orderProductList = getOrderProducts();
        for(OrderProduct op : orderProductList){
            sum += op.getTotalPrice();
        }
        return sum;
    }

    @Transient
    public int getNumberOfProducts(){
        return this.orderProducts.size();
    }

}
