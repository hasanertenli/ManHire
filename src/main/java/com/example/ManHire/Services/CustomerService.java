package com.example.ManHire.Services;

import com.example.ManHire.Entity.Customer;
import com.example.ManHire.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CustomerService
{
    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> find()
    {
       return customerRepository.findAll();

    }

    public void save(Customer customer)
    {

        customerRepository.save(customer);
    }

    public Customer findById(Long id)
    {
        return customerRepository.findOne(id);
    }

    public void delete(Customer customer)
    {
        customerRepository.delete(customer);
    }


}
