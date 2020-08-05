package com.zking.model;

public class RolePermission {
    private Integer yhRolePermissionId;

    private Integer yhRoleId;

    private Integer yhPermissionId;

    public RolePermission(Integer yhRolePermissionId, Integer yhRoleId, Integer yhPermissionId) {
        this.yhRolePermissionId = yhRolePermissionId;
        this.yhRoleId = yhRoleId;
        this.yhPermissionId = yhPermissionId;
    }

    public RolePermission() {
        super();
    }

    public Integer getYhRolePermissionId() {
        return yhRolePermissionId;
    }

    public void setYhRolePermissionId(Integer yhRolePermissionId) {
        this.yhRolePermissionId = yhRolePermissionId;
    }

    public Integer getYhRoleId() {
        return yhRoleId;
    }

    public void setYhRoleId(Integer yhRoleId) {
        this.yhRoleId = yhRoleId;
    }

    public Integer getYhPermissionId() {
        return yhPermissionId;
    }

    public void setYhPermissionId(Integer yhPermissionId) {
        this.yhPermissionId = yhPermissionId;
    }
}