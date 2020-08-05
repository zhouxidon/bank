package com.zking.model;

public class UserRole {
    private Integer yhUserRoleId;

    private Integer yhUserUid;

    private Integer yhRoleId;

    public UserRole(Integer yhUserRoleId, Integer yhUserUid, Integer yhRoleId) {
        this.yhUserRoleId = yhUserRoleId;
        this.yhUserUid = yhUserUid;
        this.yhRoleId = yhRoleId;
    }

    public UserRole() {
        super();
    }

    public Integer getYhUserRoleId() {
        return yhUserRoleId;
    }

    public void setYhUserRoleId(Integer yhUserRoleId) {
        this.yhUserRoleId = yhUserRoleId;
    }

    public Integer getYhUserUid() {
        return yhUserUid;
    }

    public void setYhUserUid(Integer yhUserUid) {
        this.yhUserUid = yhUserUid;
    }

    public Integer getYhRoleId() {
        return yhRoleId;
    }

    public void setYhRoleId(Integer yhRoleId) {
        this.yhRoleId = yhRoleId;
    }
}