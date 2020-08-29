package com.example.garden.service;

import com.example.garden.entity.Garden;
import com.example.garden.repository.GardenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GardenServiceImp implements GardenService {

    @Autowired
    private GardenRepository userProfileRepository;

    @Override
    public void addGarden(Garden garden) {
        userProfileRepository.save(garden);
    }

    @Override
    public void changeGarden(Long id, Garden gardenNewInfo) {
        gardenNewInfo.setId(id);
        userProfileRepository.save(gardenNewInfo);
    }

    @Override
    public Optional<Garden> findGarden(Long id) {
        return userProfileRepository.findById(id);
    }

    @Override
    public void deleteGarden(Long id) {
        userProfileRepository.deleteById(id);
    }
}
