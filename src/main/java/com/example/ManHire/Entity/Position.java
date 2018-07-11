package com.example.ManHire.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "Position")
@Data
public class Position
{
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    private String position;


    @JsonBackReference
    @ManyToMany(mappedBy = "positionList")
    List<Player> playerList;

}
