package com.scaler.demo.Models;

import jakarta.persistence.Entity;

@Entity
public class User extends BaseModel{
    //private Long id;
    private String userName;
    private String email;

}
