package com.alessandro.rosmarino.backend.applicationserverbe.gamification.entities;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMission;
    @Nonnull
    private String missionName;
    private String missionDescription;
    @Nonnull
    private Integer missionPoints;
    @Nonnull
    private Integer missionLevel;

    public Mission() { }

    public Mission(int idMission, String missionName, String missionDescription, int missionPoints, int missionLevel) {
        this.idMission = idMission;
        this.missionName = missionName;
        this.missionDescription = missionDescription;
        this.missionPoints = missionPoints;
        this.missionLevel = missionLevel;
    }

    public int getIdMission() {
        return idMission;
    }

    public void setIdMission(int idMission) {
        this.idMission = idMission;
    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public String getMissionDescription() {
        return missionDescription;
    }

    public void setMissionDescription(String missionDescription) {
        this.missionDescription = missionDescription;
    }

    public int getMissionPoints() {
        return missionPoints;
    }

    public void setMissionPoints(int missionPoints) {
        this.missionPoints = missionPoints;
    }

    public int getMissionLevel() {
        return missionLevel;
    }

    public void setMissionLevel(int missionLevel) {
        this.missionLevel = missionLevel;
    }
}
