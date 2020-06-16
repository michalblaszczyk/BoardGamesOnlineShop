package com.example.BoardGamesOnlineShop.controller;

import com.example.BoardGamesOnlineShop.dto.OrderProductDto;
import com.example.BoardGamesOnlineShop.exception.ResourceNotFoundException;
import com.example.BoardGamesOnlineShop.form.OrderForm;
import com.example.BoardGamesOnlineShop.model.Order;
import com.example.BoardGamesOnlineShop.model.ProductInOrder;
import com.example.BoardGamesOnlineShop.model.OrderStatus;
import com.example.BoardGamesOnlineShop.service.BoardGameService;
import com.example.BoardGamesOnlineShop.service.OrderProductService;
import com.example.BoardGamesOnlineShop.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/orders")
@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
public class OrderController {
    BoardGameService boardGameService;
    OrderService orderService;
    OrderProductService orderProductService;

    public OrderController(BoardGameService boardGameService, OrderService orderService, OrderProductService orderProductService) {
        this.boardGameService = boardGameService;
        this.orderService = orderService;
        this.orderProductService = orderProductService;
    }

    @GetMapping
    public Iterable<Order> list(){
        return this.orderService.getAllOrders();
    }

    @PostMapping
    public ResponseEntity<Order> create(@RequestBody OrderForm orderForm) throws ResourceNotFoundException {
        List<OrderProductDto> formDtos = orderForm.getProductOrdes();
        Order order = new Order();
        order.setStatus(OrderStatus.PAID.name());
        order=this.orderService.create(order);

        List<ProductInOrder> productInOrders = new ArrayList<>();
        for(OrderProductDto dto: formDtos){
            productInOrders.add(orderProductService.create(new ProductInOrder(order,
                    boardGameService.getBoardGame(dto.getBoardGame().getId()),
                    dto.getQuantity())));
        }
        order.setProductInOrders(productInOrders);
        this.orderService.update(order);


        return ResponseEntity.ok().build();

    }


}
