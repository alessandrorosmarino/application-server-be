package com.alessandro.rosmarino.backend.applicationserverbe.gamification.web.service;

import com.alessandro.rosmarino.backend.applicationserverbe.gamification.entities.Badge;
import com.alessandro.rosmarino.backend.applicationserverbe.gamification.web.repository.BadgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BadgeService {

    @Autowired
    private BadgeRepository badgeRepository;

    public List<Badge> getAllBadges() {
        return badgeRepository.findAll();
    }

    public Badge getBadgeById(Integer id) {
        return badgeRepository.findById(id).orElse(null);
    }

    public Badge addBadge(Badge badge) {
        return badgeRepository.save(badge);
    }

    public Badge updateBadge(Badge badge) {
        Badge existingBadge = badgeRepository.findById(badge.getIdBadge()).orElse(null);
        if(existingBadge == null) {
            return badgeRepository.save(badge);
        }
        existingBadge.setBadgeName(badge.getBadgeName());
        existingBadge.setBadgeDescription(badge.getBadgeDescription());
        existingBadge.setBadgePoints(badge.getBadgePoints());
        return badgeRepository.save(existingBadge);
    }

    public void deleteBadge(Integer id) {
        badgeRepository.deleteById(id);
    }
}