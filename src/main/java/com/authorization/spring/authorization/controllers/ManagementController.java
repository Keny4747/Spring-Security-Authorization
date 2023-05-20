package com.authorization.spring.authorization.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/management")
public class ManagementController {

    @GetMapping("/get")
    public String get(){
        return "GET:: management controller";
    }
    @PostMapping("/post")
    public String post(){
        return "POST:: management controller";
    }
    @PutMapping("/put")
    public String putt(){
        return "PUT:: management controller";
    }
    @DeleteMapping("delete")
    public String delete(){
        return "DELETE:: management controller";
    }
}
