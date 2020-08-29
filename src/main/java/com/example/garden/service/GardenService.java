package com.example.garden.service;

import com.example.garden.entity.Garden;

import java.util.Optional;

public interface GardenService {
    void addGarden(Garden garden);
    void changeGarden(Long id, Garden garden);
    Optional<Garden> findGarden(Long id);
    void deleteGarden(Long id);
//    void changeUserStatus(Long id, String status);
}
