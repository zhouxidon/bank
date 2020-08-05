package com.zking.model;

public class Role {
    private Integer yhRoleId;

    private String yhRoleName;

    private String yhRoleDescription;

    public Role(Integer yhRoleId, String yhRoleName, String yhRoleDescription) {
        this.yhRoleId = yhRoleId;
        this.yhRoleName = yhRoleName;
        this.yhRoleDescription = yhRoleDescription;
    }

    public Role() {
        super();
    }

    public Integer getYhRoleId() {
        return yhRoleId;
    }

    public void setYhRoleId(Integer yhRoleId) {
        this.yhRoleId = yhRoleId;
    }

    public String getYhRoleName() {
        return yhRoleName;
    }

    public void setYhRoleName(String yhRoleName) {
        this.yhRoleName = yhRoleName;
    }

    public String getYhRoleDescription() {
        return yhRoleDescription;
    }

    public void setYhRoleDescription(String yhRoleDescription) {
        this.yhRoleDescription = yhRoleDescription;
    }
}