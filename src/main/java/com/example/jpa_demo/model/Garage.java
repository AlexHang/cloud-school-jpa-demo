package com.example.jpa_demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Garage {

    @Id
    @GeneratedValue
    private Integer id;

    private String address;

}
