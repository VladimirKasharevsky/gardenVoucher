package com.example.garden.controller;

import com.example.garden.entity.Garden;
import com.example.garden.entity.Response;
import com.example.garden.service.GardenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("admin/")
public class AdminController {

    @Autowired
    private GardenService gardenService;

    @PostMapping("/garden/create")
    public Response createGarden(@RequestBody Garden garden) {
        gardenService.addGarden(garden);
        return new Response(null,"Garden created");
    }

    @PostMapping("garden/change/{gardenId}")
    public Response changeGarden(@PathVariable long gardenId, @RequestBody Garden garden) {
        gardenService.changeGarden(gardenId, garden);
        return new Response(null,"Garden updated");
    }

    @DeleteMapping("/garden/{gardenId}")
    public Response deleteGarden(@PathVariable long gardenId) {
        gardenService.deleteGarden(gardenId);
        return new Response(null, "Garden deleted");
    }
}
