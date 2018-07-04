package com.example.ManHire.Repository;

import com.example.ManHire.Entity.Defender;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DefenderRepository extends CrudRepository<Defender, Long>
{

}
