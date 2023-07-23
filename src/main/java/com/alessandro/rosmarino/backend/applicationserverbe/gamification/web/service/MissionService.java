package com.alessandro.rosmarino.backend.applicationserverbe.gamification.web.service;

import com.alessandro.rosmarino.backend.applicationserverbe.gamification.entities.Mission;
import com.alessandro.rosmarino.backend.applicationserverbe.gamification.web.repository.MissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissionService {

    @Autowired
    private MissionRepository missionRepository;

    public List<Mission> getAllMissions() {
        return missionRepository.findAll();
    }

    public Mission getMissionById(Integer id) {
        return missionRepository.findById(id).orElse(null);
    }

    public Mission addMission(Mission mission) {
        return missionRepository.save(mission);
    }

    public Mission updateMission(Mission mission) {
        Mission existingMission = missionRepository.findById(mission.getIdMission()).orElse(null);
        if(existingMission == null) {
            return missionRepository.save(mission);
        }
        existingMission.setMissionName(mission.getMissionName());
        existingMission.setMissionDescription(mission.getMissionDescription());
        existingMission.setMissionPoints(mission.getMissionPoints());
        existingMission.setMissionLevel(mission.getMissionLevel());
        return missionRepository.save(existingMission);
    }

    public void deleteMission(Integer id) {
        missionRepository.deleteById(id);
    }


}
