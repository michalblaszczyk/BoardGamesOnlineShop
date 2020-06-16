package com.example.BoardGamesOnlineShop.model;

import com.example.BoardGamesOnlineShop.model.ERole;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name ="roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private ERole name;

    public Role(ERole name) {
        this.name = name;
    }

    public Role() {
    }
}
