package com.example.garden.repository;

import com.example.garden.entity.UserProfile;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserProfileRepository extends CrudRepository<UserProfile, Long> {
    List<UserProfile> deleteById(String id);
}
