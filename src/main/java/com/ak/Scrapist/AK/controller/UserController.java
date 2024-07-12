package com.ak.Scrapist.AK.controller;

import com.ak.Scrapist.AK.model.User;
import com.ak.Scrapist.AK.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @GetMapping("/getAll")
    public List<User> getAllUsers(){
        return userService.getAllUser();
    }
}
