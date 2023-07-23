package com.alessandro.rosmarino.backend.applicationserverbe.gamification.entities;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Leaderboard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLeaderboard;
    @Nonnull
    private String leaderboardName;
    private String leaderboardDescription;

    public Leaderboard() { }

    public Leaderboard(int idLeaderboard, String leaderboardName, String leaderboardDescription) {
        this.idLeaderboard = idLeaderboard;
        this.leaderboardName = leaderboardName;
        this.leaderboardDescription = leaderboardDescription;
    }

    public int getIdLeaderboard() {
        return idLeaderboard;
    }

    public void setIdLeaderboard(int idLeaderboard) {
        this.idLeaderboard = idLeaderboard;
    }

    public String getLeaderboardName() {
        return leaderboardName;
    }

    public void setLeaderboardName(String leaderboardName) {
        this.leaderboardName = leaderboardName;
    }

    public String getLeaderboardDescription() {
        return leaderboardDescription;
    }

    public void setLeaderboardDescription(String leaderboardDescription) {
        this.leaderboardDescription = leaderboardDescription;
    }
}
