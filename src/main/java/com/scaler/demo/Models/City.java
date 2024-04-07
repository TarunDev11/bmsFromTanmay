package com.scaler.demo.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "city")
public class City extends BaseModel{
    private String name;

    @OneToMany
    private List<Theatre> theatres = new ArrayList<>();
}
