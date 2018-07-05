package com.example.ManHire.Repository;

import com.example.ManHire.Entity.Position;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PositionRepository extends CrudRepository<Position, Long>
{
    List<Position> findAll();
    Position findPositionById(@Param("id") Long id);
}
