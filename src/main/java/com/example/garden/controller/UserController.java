package com.example.garden.controller;

import com.example.garden.entity.UserProfile;
import com.example.garden.repository.GardenRepository;
import com.example.garden.repository.UserProfileRepository;
import com.example.garden.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.garden.entity.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("user/")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/registration")
    public Response registration(@RequestBody UserProfile userProfile) {
        userService.addUser(userProfile);
        return new Response(null,"User created");
    }

    @PostMapping("/change/{userId}")
    public Response changeUser(@PathVariable long userId, @RequestBody UserProfile userProfile) {
        userService.changeUser(userId, userProfile);
        return new Response(null,"User updated");
    }

    @GetMapping("/{userId}")
    public UserProfile findUser(@PathVariable long userId) {
        UserProfile userProfile = userService.findUser(userId).get();
        return userProfile;
    }
}
