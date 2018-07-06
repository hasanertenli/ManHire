package com.example.ManHire.Repository;

import com.example.ManHire.Entity.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PlayerRepository extends CrudRepository<Player,Long>
{
    List<Player> findAll();
}
