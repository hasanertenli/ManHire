package com.example.ManHire.Controllers;

import com.example.ManHire.Services.DefenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DefenderController
{
    @Autowired
    DefenderService defenderService;
}
