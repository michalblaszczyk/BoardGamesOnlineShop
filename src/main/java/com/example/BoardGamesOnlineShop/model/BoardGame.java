package com.example.BoardGamesOnlineShop.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Data
@Entity
@Table(name="boardgame")
@RequiredArgsConstructor
public class BoardGame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "boardgame_id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name = "price")
    private double price;

    @Column(name = "pictureUrl")
    private String pictureUrl;

}
