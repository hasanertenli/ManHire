package com.example.ManHire.Entity;

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
    Long id;

    String position;


    @JoinTable(name= "Position_Player", joinColumns = {@JoinColumn(name= "Position_ID",referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(name = "Player_ID",referencedColumnName = "id")})
    @ManyToMany(fetch = FetchType.EAGER)
    List<Player> playerList;

}
