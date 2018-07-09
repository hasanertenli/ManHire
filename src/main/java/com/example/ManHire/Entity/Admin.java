package com.example.ManHire.Entity;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "Admin")
@Data
public class Admin implements Serializable, UserDetails
{
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String userName;
    private String password;

    @Transient
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities()
    {
        Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        return null;
    }

    @Transient
    @Override
    public String getUsername() {
        return userName;
    }

    @Transient
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Transient
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Transient
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Transient
    @Override
    public boolean isEnabled() {
        return true;
    }
}
