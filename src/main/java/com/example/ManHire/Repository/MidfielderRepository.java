package com.example.ManHire.Repository;

import com.example.ManHire.Entity.Midfielder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MidfielderRepository extends CrudRepository<Midfielder, Long>
{

}
