package com.example.garden.repository;

import com.example.garden.entity.Garden;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GardenRepository extends CrudRepository<Garden, Long> {
    List<Garden> findByName(String name);
}
