package com.alessandro.rosmarino.backend.applicationserverbe.gamification.web.service;

import com.alessandro.rosmarino.backend.applicationserverbe.gamification.entities.Leaderboard;
import com.alessandro.rosmarino.backend.applicationserverbe.gamification.web.repository.LeaderboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaderboardService {

    @Autowired
    private LeaderboardRepository leaderboardRepository;

    public List<Leaderboard> getAllLeaderboards() {
        return leaderboardRepository.findAll();
    }

    public Leaderboard getLeaderboardById(Integer id) {
        return leaderboardRepository.findById(id).orElse(null);
    }

    public Leaderboard addLeaderboard(Leaderboard leaderboard) {
        return leaderboardRepository.save(leaderboard);
    }

    public Leaderboard updateLeaderboard(Leaderboard leaderboard) {
        Leaderboard existingLeaderboard = leaderboardRepository.findById(leaderboard.getIdLeaderboard()).orElse(null);
        if(existingLeaderboard == null) {
            return leaderboardRepository.save(leaderboard);
        }
        existingLeaderboard.setLeaderboardName(leaderboard.getLeaderboardName());
        existingLeaderboard.setLeaderboardDescription(leaderboard.getLeaderboardDescription());
        return leaderboardRepository.save(existingLeaderboard);
    }

    public void deleteLeaderboard(Integer id) {
        leaderboardRepository.deleteById(id);
    }
}
