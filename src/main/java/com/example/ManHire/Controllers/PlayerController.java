package com.example.ManHire.Controllers;

import com.example.ManHire.Entity.Customer;
import com.example.ManHire.Entity.Player;
import com.example.ManHire.Services.CustomerService;
import com.example.ManHire.Services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@ResponseBody
@RequestMapping(value = "/api/player")
public class PlayerController
{
    @Autowired
    PlayerService playerService;
    @RequestMapping(path = "/find",method = RequestMethod.GET)
    public @ResponseBody List<Player> find()
    {
        return playerService.find();
    }


    @RequestMapping(path = "/save",method = RequestMethod.POST)
    public @ResponseBody
    HttpStatus save(@RequestBody Player player)
    {
        try
        {
            playerService.save(player);

        }
        catch (Exception e)
        {
            return HttpStatus.BAD_REQUEST;
        }

        return HttpStatus.OK;
    }

    @RequestMapping(path ="/findBy/{id}", method = RequestMethod.GET)
    public @ResponseBody Player findById(@PathVariable Long id)
    {
        return playerService.findById(id);
    }
    @RequestMapping(path = "/deleteBy/{id}", method = RequestMethod.DELETE)
    public @ResponseBody HttpStatus deleteById(@PathVariable Long id)
    {
        try
        {
            playerService.deleteById(id);
        }
        catch (Exception e)
        {
            return HttpStatus.BAD_REQUEST;
        }
        return HttpStatus.OK;
    }




}
