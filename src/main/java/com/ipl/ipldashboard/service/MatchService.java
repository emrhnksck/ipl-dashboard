package com.ipl.ipldashboard.service;

import com.ipl.ipldashboard.model.Match;
import com.ipl.ipldashboard.repository.MatchRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchService {

    private MatchRepository matchRepository;

    public MatchService(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    public List<Match> getByTeam1OrTeam2OrderByDesc(String teamName, String teamName2,Pageable pageable){
        return matchRepository.getByTeam1OrTeam2OrderByDateDesc(teamName,teamName2, pageable);
    }

    public List<Match> findLatestMatchesByTeam(String teamName,int count){
        return matchRepository.getByTeam1OrTeam2OrderByDateDesc(teamName,teamName, PageRequest.of(0,count));
    }
}
