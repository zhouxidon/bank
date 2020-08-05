package com.zking.model;

public class Permission {
    private Integer yhPermissionId;

    private String yhPermissionName;

    private Integer yhPermissionPid;

    private String yhPermissionPermission;

    public Permission(Integer yhPermissionId, String yhPermissionName, Integer yhPermissionPid, String yhPermissionPermission) {
        this.yhPermissionId = yhPermissionId;
        this.yhPermissionName = yhPermissionName;
        this.yhPermissionPid = yhPermissionPid;
        this.yhPermissionPermission = yhPermissionPermission;
    }

    public Permission() {
        super();
    }

    public Integer getYhPermissionId() {
        return yhPermissionId;
    }

    public void setYhPermissionId(Integer yhPermissionId) {
        this.yhPermissionId = yhPermissionId;
    }

    public String getYhPermissionName() {
        return yhPermissionName;
    }

    public void setYhPermissionName(String yhPermissionName) {
        this.yhPermissionName = yhPermissionName;
    }

    public Integer getYhPermissionPid() {
        return yhPermissionPid;
    }

    public void setYhPermissionPid(Integer yhPermissionPid) {
        this.yhPermissionPid = yhPermissionPid;
    }

    public String getYhPermissionPermission() {
        return yhPermissionPermission;
    }

    public void setYhPermissionPermission(String yhPermissionPermission) {
        this.yhPermissionPermission = yhPermissionPermission;
    }
}