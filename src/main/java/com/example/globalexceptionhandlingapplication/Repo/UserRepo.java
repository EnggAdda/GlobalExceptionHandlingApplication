package com.example.globalexceptionhandlingapplication.Repo;

import com.example.globalexceptionhandlingapplication.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
