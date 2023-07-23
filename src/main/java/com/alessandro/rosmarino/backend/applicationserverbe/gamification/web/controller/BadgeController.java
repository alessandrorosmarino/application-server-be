package com.alessandro.rosmarino.backend.applicationserverbe.gamification.web.controller;

import com.alessandro.rosmarino.backend.applicationserverbe.gamification.entities.Badge;
import com.alessandro.rosmarino.backend.applicationserverbe.gamification.web.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BadgeController {

    @Autowired
    private BadgeService badgeService;

    @GetMapping("/badges")
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }

    @PostMapping("/badges")
    public void addBadge(@RequestBody Badge badge) {
        badgeService.addBadge(badge);
    }

    @DeleteMapping("/badges/{id}")
    public void deleteBadge(@PathVariable Integer id) {
        badgeService.deleteBadge(id);
    }
}
