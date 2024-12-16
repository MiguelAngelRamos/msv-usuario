package com.kibernumacademy.userservice.controller;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kibernumacademy.userservice.model.User;
import com.kibernumacademy.userservice.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
  
  private UserService userService;
  
  public UserController(UserService userService) {
    this.userService = userService;
  }


  @PostMapping
  public ResponseEntity<User> createUser(@RequestBody User user) {
    User userCreated = userService.createUser(user);
    return ResponseEntity.ok(userCreated);
  }

  @GetMapping
  public ResponseEntity<List<User>> getAllUsers() {
    List<User> users = userService.getAllUsers();
    return ResponseEntity.ok(users);
  }

  @GetMapping("/{id}")
  public ResponseEntity<User> getUserById(@PathVariable Long id) {
    User user = userService.getUserById(id);
    return ResponseEntity.ok(user);
  }

  
}
