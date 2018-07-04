package com.example.ManHire.Repository;

import com.example.ManHire.Entity.Striker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StrikerRepository extends CrudRepository<Striker, Long>
{

}
