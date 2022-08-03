package com.example.jpa_demo.model;

import javax.persistence.*;

@Entity
public class Passenger {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @ManyToOne
    private Car car;

}
