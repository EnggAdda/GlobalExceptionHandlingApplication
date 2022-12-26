package com.example.globalexceptionhandlingapplication.Controller;


import com.example.globalexceptionhandlingapplication.Entity.User;
import com.example.globalexceptionhandlingapplication.Exception.UserNotFoundException;
import com.example.globalexceptionhandlingapplication.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

     @Autowired
     private UserService userService;
    @GetMapping("/findAll")
    public List<User> findAll(){

       return userService.findAllUsersFromDB();
    }

    @GetMapping("/User/{id}")
    public User findUserById(@PathVariable int id) throws UserNotFoundException {

        return userService.getUserById(id);
    }

    @PostMapping("/insert")
    public User insertUserIntoDb(@RequestBody User user){

        return userService.insertUserIntoDB(user);
    }
}
