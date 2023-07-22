package com.charan.SpringApp.controller;

import com.charan.SpringApp.entity.User;
import com.charan.SpringApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/*Methods for requests like GET and POST*/
@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/findAll")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @PostMapping("/insert")
    public User insertUser(@RequestBody User user){
        return userRepository.save(user);
    }
}
