package com.zking.model;

public class ManagerPermission {
    private Integer yhManagerPermissionId;

    private Integer yhManagerId;

    private Integer yhPermissionId;

    public ManagerPermission(Integer yhManagerPermissionId, Integer yhManagerId, Integer yhPermissionId) {
        this.yhManagerPermissionId = yhManagerPermissionId;
        this.yhManagerId = yhManagerId;
        this.yhPermissionId = yhPermissionId;
    }

    public ManagerPermission() {
        super();
    }

    public Integer getYhManagerPermissionId() {
        return yhManagerPermissionId;
    }

    public void setYhManagerPermissionId(Integer yhManagerPermissionId) {
        this.yhManagerPermissionId = yhManagerPermissionId;
    }

    public Integer getYhManagerId() {
        return yhManagerId;
    }

    public void setYhManagerId(Integer yhManagerId) {
        this.yhManagerId = yhManagerId;
    }

    public Integer getYhPermissionId() {
        return yhPermissionId;
    }

    public void setYhPermissionId(Integer yhPermissionId) {
        this.yhPermissionId = yhPermissionId;
    }
}