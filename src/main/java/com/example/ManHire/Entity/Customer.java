package com.example.ManHire.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
    private Long id;

    private String name;

    private String surName;

    private int phone;

    private String address;



    @JsonBackReference
    @ManyToMany(mappedBy = "customerList")
    List<Player> player;

}
