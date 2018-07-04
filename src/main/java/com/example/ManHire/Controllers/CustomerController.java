package com.example.ManHire.Controllers;

import com.example.ManHire.Entity.Customer;
import com.example.ManHire.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;
@Controller
@ResponseBody
@RequestMapping(value = "/api/customer")
public class CustomerController
{
    @Autowired
    CustomerService customerService;
    @RequestMapping(path = "/find",method = RequestMethod.GET)
    public @ResponseBody List<Customer> deneme()
    {
      return customerService.deneme();
    }


    @RequestMapping(path = "/save",method = RequestMethod.POST)
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
    @RequestMapping(path = "/deleteBy/{id}", method = RequestMethod.DELETE)
    public @ResponseBody HttpStatus deleteById(@PathVariable Long id)
    {
        try
        {
            customerService.deleteById(id);
        }
        catch (Exception e)
        {
            return HttpStatus.BAD_REQUEST;
        }
        return HttpStatus.OK;
    }


}
