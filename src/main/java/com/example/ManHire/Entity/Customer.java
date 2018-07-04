package com.example.ManHire.Entity;


import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

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

}
