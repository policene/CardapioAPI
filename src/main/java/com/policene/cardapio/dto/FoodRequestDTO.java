package com.policene.cardapio.dto;

import com.policene.cardapio.entity.Food;

public record FoodRequestDTO(String title, String image, Integer price) {

    public FoodRequestDTO(Food food){
        this(
                food.getTitle(),
                food.getImage(),
                food.getPrice()
        );
    }

}
