package com.example.ManHire.Repository;

import com.example.ManHire.Entity.GoalKeeper;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoalkeeperRepository extends CrudRepository<GoalKeeper, Long>
{

}
