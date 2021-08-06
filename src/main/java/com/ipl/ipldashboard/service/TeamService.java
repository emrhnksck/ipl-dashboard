package com.ipl.ipldashboard.service;

import com.ipl.ipldashboard.model.Team;
import com.ipl.ipldashboard.repository.TeamRepository;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

    private TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public Team findByTeamName(String teamName){
        return teamRepository.findByTeamName(teamName);
    }

}
