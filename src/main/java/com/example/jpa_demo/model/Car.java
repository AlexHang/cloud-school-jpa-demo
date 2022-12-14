package com.example.jpa_demo.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity
public class Car {

    @Id
    @GeneratedValue
    private String serialNumber;

    @Column(name = "power")
    @NotNull
    private int horsePower;

    @Transient
    private int noOfDoors;

    @OneToMany
    private List<Passenger> passengerList;

    @OneToOne
    private Garage garage;

}

