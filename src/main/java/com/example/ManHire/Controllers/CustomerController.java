package com.example.ManHire.Controllers;

import com.example.ManHire.Entity.Customer;
import com.example.ManHire.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@ResponseBody
@RequestMapping(value = "/api/customer")
public class CustomerController
{
    @Autowired
    CustomerService customerService;
    @RequestMapping(path = "/find",method = RequestMethod.GET)
    public @ResponseBody List<Customer> find()
    {
      return customerService.find();
    }


    @RequestMapping(path = "/save",method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody
    HttpStatus save(@RequestBody Customer customer)
    {
        try
        {
            customerService.save(customer);

        }
        catch (Exception e)
        {
            return HttpStatus.BAD_REQUEST;
        }

        return HttpStatus.OK;
    }

    @RequestMapping(path ="/findBy/{id}", method = RequestMethod.GET)
    public @ResponseBody Customer findById(@PathVariable Long id)
    {
        return customerService.findById(id);
    }
    @RequestMapping(path = "/delete", method = RequestMethod.POST)
    public @ResponseBody HttpStatus delete(@RequestBody Customer customer)
    {
        try
        {
            customerService.delete(customer);
        }
        catch (Exception e)
        {
            return HttpStatus.BAD_REQUEST;
        }
        return HttpStatus.OK;
    }


}
