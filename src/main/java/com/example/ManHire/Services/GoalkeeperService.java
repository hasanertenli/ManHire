package com.example.ManHire.Services;

import com.example.ManHire.Repository.GoalkeeperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoalkeeperService
{
    @Autowired
    GoalkeeperRepository goalkeeperRepository;
}
