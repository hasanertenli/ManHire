package com.example.ManHire.Entity;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Goalkeeper")
@EntityListeners(AuditingEntityListener.class)
@Data
public class GoalKeeper
{
    @Id
    Long id;

    String name;
    String surName;
    int age;
    String level;
    float price;
    String ctiy;

}
