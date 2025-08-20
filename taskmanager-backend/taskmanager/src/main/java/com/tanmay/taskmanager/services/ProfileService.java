package com.tanmay.taskmanager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tanmay.taskmanager.entity.Profile;
import com.tanmay.taskmanager.repository.ProfileRepository;

@Service
public class ProfileService {
    @Autowired
    private ProfileRepository profileRepository;

    public Profile saveProfile(Profile profile) {
        return profileRepository.save(profile);
    }

    public Profile getProfileByUserId(Long userId) {
        return profileRepository.findByUserId(userId);
    }
}
