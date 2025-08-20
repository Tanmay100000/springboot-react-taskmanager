package com.tanmay.taskmanager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tanmay.taskmanager.entity.User;
import com.tanmay.taskmanager.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
