package com.example.garden.controller;

import com.example.garden.repository.VoucherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class Controller {

    @GetMapping("/hello")
    public String home() {
        return "This is VOUCHER module";
    }
}
