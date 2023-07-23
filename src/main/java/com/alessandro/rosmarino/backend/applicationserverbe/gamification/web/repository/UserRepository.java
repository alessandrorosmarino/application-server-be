package com.alessandro.rosmarino.backend.applicationserverbe.gamification.web.repository;

import com.alessandro.rosmarino.backend.applicationserverbe.gamification.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    public User findByUsername(String username);
}
