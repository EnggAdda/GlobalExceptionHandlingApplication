package com.example.globalexceptionhandlingapplication.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name ="user")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Id
     private Integer id;
     private String name;
     private String address;
     private Double salary ;
     private int age ;
}
