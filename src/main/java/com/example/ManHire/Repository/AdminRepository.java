package com.example.ManHire.Repository;

import com.example.ManHire.Entity.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Long>
{
    Admin findByuserName(String name);
}
