package com.alessandro.rosmarino.backend.applicationserverbe.gamification.web.controller;

import com.alessandro.rosmarino.backend.applicationserverbe.gamification.entities.Role;
import com.alessandro.rosmarino.backend.applicationserverbe.gamification.web.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/roles")
    public List<Role> getAllRoles() {
        return roleService.getAllRoles();
    }

    @PostMapping("/roles")
    public void addRole(@RequestBody Role role) {
        roleService.addRole(role);
    }

    @DeleteMapping("/roles/{id}")
    public void deleteRole(@PathVariable Integer id) {
        roleService.deleteRole(id);
    }
}
