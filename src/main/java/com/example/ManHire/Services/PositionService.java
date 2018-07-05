package com.example.ManHire.Services;

import com.example.ManHire.Entity.Position;
import com.example.ManHire.Repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PositionService
{
    @Autowired
    PositionRepository positionRepository;

    public List<Position> find()
    {
        return positionRepository.findAll();

    }

    public void save(Position position)
    {

        positionRepository.save(position);
    }

    public Position findById(Long id)
    {
        return positionRepository.findPositionById(id);
    }

    public void deleteById(Long id)
    {
        positionRepository.delete(id);
    }
}
