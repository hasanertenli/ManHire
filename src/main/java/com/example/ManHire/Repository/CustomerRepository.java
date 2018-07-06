package com.example.ManHire.Repository;

import com.example.ManHire.Entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long>
{
    List<Customer> findAll();





}
