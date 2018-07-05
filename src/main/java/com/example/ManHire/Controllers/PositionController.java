package com.example.ManHire.Controllers;

import com.example.ManHire.Entity.Position;
import com.example.ManHire.Services.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@ResponseBody
@RequestMapping(value = "/api/position")
public class PositionController
{
    @Autowired
    PositionService positionService;
    @RequestMapping(path = "/find",method = RequestMethod.GET)
    public @ResponseBody List<Position> find()
    {
        return positionService.find();
    }


    @RequestMapping(path = "/save",method = RequestMethod.POST)
    public @ResponseBody
    HttpStatus save(@RequestBody Position position)
    {
        try
        {
            positionService.save(position);

        }
        catch (Exception e)
        {
            return HttpStatus.BAD_REQUEST;
        }

        return HttpStatus.OK;
    }

    @RequestMapping(path ="/findBy/{id}", method = RequestMethod.GET)
    public @ResponseBody Position findById(@PathVariable Long id)
    {
        return positionService.findById(id);
    }
    @RequestMapping(path = "/deleteBy/{id}", method = RequestMethod.DELETE)
    public @ResponseBody HttpStatus deleteById(@PathVariable Long id)
    {
        try
        {
            positionService.deleteById(id);
        }
        catch (Exception e)
        {
            return HttpStatus.BAD_REQUEST;
        }
        return HttpStatus.OK;
    }


}
