package com.alessandro.rosmarino.backend.applicationserverbe.gamification.web.service;

import com.alessandro.rosmarino.backend.applicationserverbe.gamification.entities.Role;
import com.alessandro.rosmarino.backend.applicationserverbe.gamification.web.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public Role getRoleById(Integer id) {
        return roleRepository.findById(id).orElse(null);
    }

    public Role getRoleByCode(String name) {
        return roleRepository.findByRoleCode(name);
    }

    public Role addRole(Role role) {
        return roleRepository.save(role);
    }

    public Role updateRole(Role role) {
        Role existingRole = roleRepository.findByRoleCode(role.getRoleCode());
        existingRole.setRoleCode(role.getRoleCode());
        existingRole.setRoleName(role.getRoleName());
        return roleRepository.save(existingRole);
    }

    public void deleteRole(Integer id) {
        roleRepository.deleteById(id);
    }
}
