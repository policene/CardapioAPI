package com.policene.cardapio.entity;

import com.policene.cardapio.dto.FoodRequestDTO;
import jakarta.persistence.*;
import lombok.Data;

@Table(name = "foods")
@Entity(name = "foods")
@Data
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;

    public Food(FoodRequestDTO data) {
        this.image = data.image();
        this.title = data.title();
        this.price = data.price();
    }

    public Food() {

    }
}
