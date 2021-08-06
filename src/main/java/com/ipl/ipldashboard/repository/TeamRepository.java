package com.ipl.ipldashboard.repository;

import com.ipl.ipldashboard.model.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team,Long> {

    Team findByTeamName(String teamName);


}
