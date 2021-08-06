package com.ipl.ipldashboard.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String teamName;
    private long totalMatches;
    private long totalWins;
    @Transient
    private List<Match> matches;

    public Team(String teamName,long totalMatches){
        this.teamName = teamName;
        this.totalMatches = totalMatches;
    }
}
