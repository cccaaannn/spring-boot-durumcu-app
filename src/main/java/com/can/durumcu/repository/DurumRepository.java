package com.can.durumcu.repository;

import com.can.durumcu.entity.Durum;
import com.can.durumcu.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DurumRepository extends JpaRepository<Durum, Long> {
    Durum getByName(String name);

    @Query("FROM Durum order by id")
    List<Durum> findAllOrdered();
}
