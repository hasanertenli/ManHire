package com.example.ManHire.Services;

import com.example.ManHire.Entity.Admin;
import com.example.ManHire.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService
{
    @Autowired
    AdminRepository adminRepository;

    public List<Admin> find()
    {
       return (List<Admin>) adminRepository.findAll();
    }

    public void save(Admin admin)
    {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        admin.setPassword(bCryptPasswordEncoder.encode(admin.getPassword()));
        adminRepository.save(admin);
    }

    public Admin findById(Long id)
    {
        return adminRepository.findOne(id);
    }

    public void deleteById(Long id)
    {
        adminRepository.delete(id);
    }

    public Admin findUser(String name){
        return adminRepository.findByuserName(name);

    }

}
