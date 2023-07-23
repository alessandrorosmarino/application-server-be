package com.alessandro.rosmarino.backend.applicationserverbe.gamification.entities;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRole;
    @Nonnull
    @Column(unique = true)
    private String roleCode;
    @Nonnull
    private String roleName;

    public Role() { }

    public Role(int idRole, String roleCode, String roleName) {
        this.idRole = idRole;
        this.roleCode = roleCode;
        this.roleName = roleName;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
