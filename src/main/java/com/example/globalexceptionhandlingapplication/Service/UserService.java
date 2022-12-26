package com.example.globalexceptionhandlingapplication.Service;


import com.example.globalexceptionhandlingapplication.Entity.User;
import com.example.globalexceptionhandlingapplication.Exception.UserNotFoundException;
import com.example.globalexceptionhandlingapplication.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User getUserById(int id) throws UserNotFoundException {

      return  userRepo.findById(id).orElseThrow(()->new UserNotFoundException("user with  id  "+id +"is not there in database"));
    }

    public List<User> findAllUsersFromDB(){

        return  userRepo.findAll();
    }

    public User insertUserIntoDB(User user){

        return  userRepo.save(user);
    }
}
