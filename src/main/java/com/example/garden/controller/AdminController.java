package com.example.garden.controller;

import com.example.garden.entity.Response;
import com.example.garden.entity.UserProfile;
import com.example.garden.repository.UserProfileRepository;
import com.example.garden.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("admin/")
public class AdminController {

    @Autowired
    private UserService userService;

    @DeleteMapping("/user/{userId}")
    public Response userDelete(@PathVariable long userId) {
        userService.deleteUser(userId);
        return new Response(null, "User deleted");
    }

    @PatchMapping ("/user/block/{userId}")
    public Response userBlock(@PathVariable long userId) {
        userService.changeUserStatus(userId, "block");
        return new Response(null, "User blocked");
    }

    @PatchMapping ("/user/unlock/{userId}")
    public Response userUnLock(@PathVariable long userId) {
        userService.changeUserStatus(userId, "active");
        return new Response(null, "User unlocked");
    }
}
