package com.example.ManHire.Controllers;

import com.example.ManHire.Entity.Admin;
import com.example.ManHire.Services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping(value = "/api/admin")
public class AdminController
{
    @Autowired
    AdminService adminService;

    @RequestMapping(value = "/find",method = RequestMethod.GET)
    public @ResponseBody
    List<Admin> find()
    {
        return adminService.find();
    }

    @RequestMapping(path = "/save",method = RequestMethod.POST)
    public @ResponseBody
    HttpStatus save(@RequestBody Admin admin)
    {
        try
        {
            adminService.save(admin);
        }
        catch (Exception e)
        {
            return HttpStatus.BAD_REQUEST;
        }
        return HttpStatus.OK;
    }

    @RequestMapping(path = "/findBy/{id}",method = RequestMethod.GET)
    public @ResponseBody
    Admin findById(@PathVariable Long id)
    {
        return adminService.findById(id);
    }

    @RequestMapping(path = "/deleteBy/{id}",method = RequestMethod.DELETE)
    public @ResponseBody HttpStatus delete(@PathVariable Long id)
    {
        try
        {
             adminService.deleteById(id);
        }
        catch (Exception e)
        {
            return HttpStatus.BAD_REQUEST;
        }
        return HttpStatus.OK;
    }

    @RequestMapping(value = "findUserData",method = RequestMethod.GET)
    public void findUserData(@PathVariable String name){
        adminService.findUser(name);
    }


}
