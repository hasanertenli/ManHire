package com.example.ManHire.Entity;


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
    Long id;

    String name;
    String surName;
    int age;
    String level;
    float price;
    String city;


    @JoinTable(name = "Player_Customer", joinColumns= {@JoinColumn(name = "Player_ID", referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(name = "Customer_ID",referencedColumnName = "id")})
    @ManyToMany(fetch = FetchType.EAGER)
    List<Customer> customerList;


    @ManyToMany(mappedBy = "playerList")
    List<Position> positionList;

}
