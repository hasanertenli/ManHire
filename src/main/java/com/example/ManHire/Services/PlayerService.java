package com.example.ManHire.Services;

import com.example.ManHire.Entity.Customer;
import com.example.ManHire.Entity.Player;
import com.example.ManHire.Repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService
{
    @Autowired
    PlayerRepository playerRepository;

    public List<Player> find()
    {
        return playerRepository.findAll();

    }

    public void save(Player player)
    {

        playerRepository.save(player);
    }

    public Player findById(Long id)
    {
        return playerRepository.findOne(id);
    }

    public void delete(Player player)
    {
        playerRepository.delete(player);
    }

}
