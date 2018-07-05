package com.example.ManHire.Entity;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "Customer")
@EntityListeners(AuditingEntityListener.class)
@Data
public class Customer {

    @Id
    Long id;

    private String name;

    String surName;

    int phone;

    String address;


    public Long getId() {
        return id;
    }


    @ManyToMany(mappedBy = "customerList")
    List<Player> playerList;

}
