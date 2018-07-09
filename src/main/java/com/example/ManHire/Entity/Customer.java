package com.example.ManHire.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "Customer")
@Data
public class Customer {

    @Id
    private Long id;

    private String name;

    private String surName;

    private long phone;

    private String address;



    @JsonBackReference
    @ManyToMany(mappedBy = "customerList")
    List<Player> player;

}
