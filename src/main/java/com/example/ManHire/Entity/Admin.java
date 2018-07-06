package com.example.ManHire.Entity;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Admin")
@EntityListeners(AuditingEntityListener.class)
@Data
public class Admin
{
    @Id
    private Long id;
    private String userName;
    private String password;
}
