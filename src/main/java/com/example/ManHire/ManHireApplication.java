package com.example.ManHire;

import com.example.ManHire.Entity.Admin;
import com.example.ManHire.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
public class ManHireApplication implements CommandLineRunner
{
	@Autowired
	AdminRepository adminRepository;

	public static void main(String[] args) {
		SpringApplication.run(ManHireApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception
	{
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		if(adminRepository.count()==0)
		{
			Admin admin = new Admin();
			admin.setUserName("Hasan");
			admin.setPassword(bCryptPasswordEncoder.encode("hsn080695."));
			adminRepository.save(admin);
		}

	}
}
