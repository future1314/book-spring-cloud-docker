package com.getset.cloud.controller;

import com.getset.cloud.entity.User;
import com.getset.cloud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User FindUserById(@PathVariable Long id) {
        return userRepository.findOne(id);
    }
}
