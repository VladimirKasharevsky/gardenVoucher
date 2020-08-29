package com.example.garden.controller;

import com.example.garden.entity.Garden;
import com.example.garden.service.GardenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("garden/")
public class GardenController {

    @Autowired
    private GardenService gardenService;

    @GetMapping("/{gardenId}")
    public Garden findGarden(@PathVariable long gardenId) {
        return gardenService.findGarden(gardenId).get();
    }
}
