package com.alessandro.rosmarino.backend.applicationserverbe.gamification.web.controller;

import com.alessandro.rosmarino.backend.applicationserverbe.gamification.entities.Mission;
import com.alessandro.rosmarino.backend.applicationserverbe.gamification.web.service.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MissionController {

    @Autowired
    private MissionService missionService;

    @GetMapping("/missions")
    public List<Mission> getAllMissions() {
        return missionService.getAllMissions();
    }

    @PostMapping("/missions")
    public void addMission(@RequestBody Mission mission) {
        missionService.addMission(mission);
    }

    @DeleteMapping("/missions/{id}")
    public void deleteMission(@PathVariable Integer id) {
        missionService.deleteMission(id);
    }
}
