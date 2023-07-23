package com.alessandro.rosmarino.backend.applicationserverbe.gamification.web.controller;

import com.alessandro.rosmarino.backend.applicationserverbe.gamification.entities.Leaderboard;
import com.alessandro.rosmarino.backend.applicationserverbe.gamification.web.service.LeaderboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LeaderboardController {

    @Autowired
    private LeaderboardService leaderboardService;

    @GetMapping("/leaderboards")
    public List<Leaderboard> getAllLeaderboards() {
        return leaderboardService.getAllLeaderboards();
    }

    @PostMapping("/leaderboards")
    public void addLeaderboard(@RequestBody Leaderboard leaderboard) {
        leaderboardService.addLeaderboard(leaderboard);
    }

    @DeleteMapping("/leaderboards/{id}")
    public void deleteLeaderboard(@PathVariable Integer id) {
        leaderboardService.deleteLeaderboard(id);
    }
}
