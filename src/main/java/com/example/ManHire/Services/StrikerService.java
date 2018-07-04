package com.example.ManHire.Services;

import com.example.ManHire.Repository.StrikerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StrikerService
{
    @Autowired
    StrikerRepository strikerRepository;
}
