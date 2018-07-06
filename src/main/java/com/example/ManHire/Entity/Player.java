package com.example.ManHire.Entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "Player")
@EntityListeners(AuditingEntityListener.class)
@Data
public class Player
{
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
