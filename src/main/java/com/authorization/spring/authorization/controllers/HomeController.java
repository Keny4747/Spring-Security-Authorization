package com.authorization.spring.authorization.controllers;

import com.authorization.spring.authorization.model.UserEntity;
import com.authorization.spring.authorization.repository.UserRepository;
import com.authorization.spring.authorization.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    private final UserService userService;

    public HomeController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public UserEntity register(@RequestBody UserEntity user){
        return userService.addUser(user);
    }

    @GetMapping
    public List<UserEntity> getAll(){
        return userService.getAll();
    }
}
