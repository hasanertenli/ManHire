package com.example.ManHire.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "Position")
@EntityListeners(AuditingEntityListener.class)
@Data
public class Position
{
    @Id
    private Long id;

    private String position;


    @JsonBackReference
    @ManyToMany(mappedBy = "positionList")
    List<Player> playerList;

}
