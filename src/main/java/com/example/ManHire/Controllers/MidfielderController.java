package com.example.ManHire.Controllers;

import com.example.ManHire.Services.MidfielderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MidfielderController
{
    @Autowired
    MidfielderService midfielderService;
}
