package com.example.ManHire;

import com.example.ManHire.Repository.AdminRepository;
import com.example.ManHire.Services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class ApplicationSecurityConfiguration extends GlobalAuthenticationConfigurerAdapter
{
    @Autowired
    AdminService adminService;

    public BCryptPasswordEncoder getPassword()
    {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }
    public void init(AuthenticationManagerBuilder authenticationManagerBuilder)throws Exception{
        authenticationManagerBuilder.userDetailsService(userDetailsService()).passwordEncoder(new BCryptPasswordEncoder());
    }
    UserDetailsService userDetailsService(){
        UserDetailsService detailsService = new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
                return adminService.findUser(name);
            }
        };
        if (detailsService!=null)
            return detailsService;
        else
            return null;
    }

}
