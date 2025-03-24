package com.policene.cardapio.controller;

import com.policene.cardapio.dto.FoodRequestDTO;
import com.policene.cardapio.dto.FoodResponseDTO;
import com.policene.cardapio.entity.Food;
import com.policene.cardapio.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/food")
public class FoodController {

    private FoodService foodService;

    @Autowired
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data) {
        Food food = new Food(data);
        foodService.save(food);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodResponseDTO> getAll(){
        return foodService.findAll().stream()
                .map(FoodResponseDTO::new)
                .collect(Collectors.toList());
    }

}
