package com.alessandro.rosmarino.backend.applicationserverbe.gamification.web.repository;

import com.alessandro.rosmarino.backend.applicationserverbe.gamification.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByRoleCode(String roleCode);
}
