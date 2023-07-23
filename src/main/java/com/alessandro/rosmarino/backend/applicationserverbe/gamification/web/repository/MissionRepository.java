package com.alessandro.rosmarino.backend.applicationserverbe.gamification.web.repository;

import com.alessandro.rosmarino.backend.applicationserverbe.gamification.entities.Mission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MissionRepository extends JpaRepository<Mission, Integer> {
}
