package com.alessandro.rosmarino.backend.applicationserverbe.gamification.entities;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Badge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBadge;
    @Nonnull
    private String badgeName;
    private String badgeDescription;
    @Nonnull
    private int badgePoints;

    public Badge() { }

    public Badge(int idBadge, String badgeName, String badgeDescription, int badgePoints) {
        this.idBadge = idBadge;
        this.badgeName = badgeName;
        this.badgeDescription = badgeDescription;
        this.badgePoints = badgePoints;
    }

    public int getIdBadge() {
        return idBadge;
    }

    public void setIdBadge(int idBadge) {
        this.idBadge = idBadge;
    }

    public String getBadgeName() {
        return badgeName;
    }

    public void setBadgeName(String badgeName) {
        this.badgeName = badgeName;
    }

    public String getBadgeDescription() {
        return badgeDescription;
    }

    public void setBadgeDescription(String badgeDescription) {
        this.badgeDescription = badgeDescription;
    }

    public int getBadgePoints() {
        return badgePoints;
    }

    public void setBadgePoints(int badgePoints) {
        this.badgePoints = badgePoints;
    }
}
