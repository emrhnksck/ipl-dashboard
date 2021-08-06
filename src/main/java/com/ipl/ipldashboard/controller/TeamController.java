package com.ipl.ipldashboard.controller;

import com.ipl.ipldashboard.model.Team;
import com.ipl.ipldashboard.service.MatchService;
import com.ipl.ipldashboard.service.TeamService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

    private TeamService teamService;
    private MatchService matchService;

    public TeamController(TeamService teamService, MatchService matchService) {
        this.teamService = teamService;
        this.matchService = matchService;
    }

    @GetMapping("/team/{teamName}")
    public Team getTeam(@PathVariable String teamName){
        Team team = teamService.findByTeamName(teamName);
        team.setMatches(matchService.findLatestMatchesByTeam(teamName,4));
        return team;
    }

}
