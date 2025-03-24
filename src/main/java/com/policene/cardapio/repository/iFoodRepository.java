package com.policene.cardapio.repository;

import com.policene.cardapio.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iFoodRepository extends JpaRepository<Food, Long> {
}
