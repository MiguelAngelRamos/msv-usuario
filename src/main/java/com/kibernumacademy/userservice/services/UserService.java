package com.kibernumacademy.userservice.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kibernumacademy.userservice.model.User;
import com.kibernumacademy.userservice.repository.UserRepository;

@Service
public class UserService {

 private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User createUser(User user) {
    return userRepository.save(user);
  }

  public List<User> getAllUsers() {
    return userRepository.findAll();
  }
  
}
