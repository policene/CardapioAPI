package com.policene.cardapio.service;

import com.policene.cardapio.entity.Food;
import com.policene.cardapio.repository.iFoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodService {

    private final iFoodRepository iFoodRepository;

    @Autowired
    public FoodService(iFoodRepository iFoodRepository) {
        this.iFoodRepository = iFoodRepository;
    }

    public List<Food> findAll(){
        return iFoodRepository.findAll();
    }

    public void save(Food food) {
        iFoodRepository.save(food);
    }

    public void delete(Food food) {
        iFoodRepository.delete(food);
    }

    public Optional<Food> findById(Long id) {
        return Optional.of(iFoodRepository.findById(id).get());
    }

}
