package com.example.ManHire.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Player")
@Data
public class Player {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    private String name;
    private String surName;
    private int age;
    private String level;
    private float price;
    private String city;


    @ManyToMany
    List<Customer> customerList;


    @ManyToMany
    List<Position> positionList;

}
