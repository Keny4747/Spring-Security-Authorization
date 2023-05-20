package com.authorization.spring.authorization.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {

    @GetMapping("/get")
    public String get(){
        return "GET:: admin controller";
    }
    @GetMapping("/show")
    public String geti(){
        return "prueba";
    }
    @PostMapping("/post")
    public String post(){
        return "POST:: admin controller";
    }
    @PutMapping("/put")
    public String putt(){
        return "PUT:: admin controller";
    }
    @DeleteMapping("/delete")
    public String delete(){
        return "DELETE:: admin controller";
    }
}
