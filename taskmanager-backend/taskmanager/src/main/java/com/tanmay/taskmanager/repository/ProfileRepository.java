package com.tanmay.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tanmay.taskmanager.entity.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
    Profile findByUserId(Long userId);
}
