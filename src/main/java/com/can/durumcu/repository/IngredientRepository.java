package com.can.durumcu.repository;

import com.can.durumcu.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
    Ingredient getByName(String name);

    @Query("FROM Ingredient order by id")
    List<Ingredient> findAllOrdered();
}
