package com.kibernumacademy.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kibernumacademy.userservice.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{
  
}
