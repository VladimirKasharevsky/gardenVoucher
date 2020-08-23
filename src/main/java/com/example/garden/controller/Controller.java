package com.example.garden.controller;

import com.example.garden.repository.GardenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class Controller {

    @Autowired
    private GardenRepository repository;

    @GetMapping("/hello")
    public String home() {
        return "Hello World";
    }
}
