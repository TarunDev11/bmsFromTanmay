package com.scaler.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "theatre")
public class Theatre extends BaseModel{

    private String name;
    private String address;

}
