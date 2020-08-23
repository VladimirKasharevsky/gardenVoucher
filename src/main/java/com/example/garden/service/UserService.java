package com.example.garden.service;

import com.example.garden.entity.UserProfile;

import java.util.Optional;

public interface UserService {
    void addUser(UserProfile userProfile);
    void changeUser(Long id, UserProfile userProfile);
    Optional<UserProfile> findUser(Long id);
    void deleteUser(Long id);
    void changeUserStatus(Long id, String status);
}
