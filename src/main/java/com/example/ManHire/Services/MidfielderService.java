package com.example.ManHire.Services;

import com.example.ManHire.Repository.MidfielderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MidfielderService
{
    @Autowired
    MidfielderRepository midfielderRepository;
}
