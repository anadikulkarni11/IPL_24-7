package com.cts.ipl247.repository;

import org.springframework.data.repository.CrudRepository;

import com.cts.ipl247.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long>  {

    Team findByTeamName(String teamName);
    
}
