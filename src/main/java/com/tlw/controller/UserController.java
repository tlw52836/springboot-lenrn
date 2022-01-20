package com.tlw.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @PostMapping("/user")
    public String addUser() {
        return "addUser";
    }

    @DeleteMapping("/user")
    public String deleteUser() {
        return "deleteUser";
    }

    @PutMapping("/user")
    public String putUser() {
        return "updateUser";
    }

    @GetMapping("/user")
    public String queryUser() {
        return "queryUser";
    }
}
