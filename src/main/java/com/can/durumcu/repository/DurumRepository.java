package com.can.durumcu.repository;

import com.can.durumcu.entity.Durum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DurumRepository extends JpaRepository<Durum, Long> {

    @Query("FROM Durum order by id")
    List<Durum> findAllOrdered();
}
