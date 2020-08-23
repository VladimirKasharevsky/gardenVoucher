package com.example.garden.service;

import com.example.garden.entity.UserProfile;
import com.example.garden.repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserProfileRepository userProfileRepository;

    @Override
    public void addUser(UserProfile userProfile) {
        userProfileRepository.save(userProfile);
    }

    @Override
    public void changeUser(Long id, UserProfile userProfileNewInfo) {
        userProfileNewInfo.setId(id);
        userProfileRepository.save(userProfileNewInfo);
    }

    @Override
    public Optional<UserProfile> findUser(Long id) {
        Optional<UserProfile> userProfile = userProfileRepository.findById(id);
        return userProfile;
    }

    @Override
    public void deleteUser(Long id) {
        userProfileRepository.deleteById(id);
    }

    @Override
    public void changeUserStatus(Long id, String status) {
        UserProfile userProfile = findUser(id).get();
        userProfile.setUserStatus(status);
        userProfileRepository.save(userProfile);
    }
}
