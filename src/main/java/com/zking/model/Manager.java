package com.zking.model;

public class Manager {
    private Integer yhManagerId;

    private String yhManagerName;

    private String yhManagerPwd;

    public Manager(Integer yhManagerId, String yhManagerName, String yhManagerPwd) {
        this.yhManagerId = yhManagerId;
        this.yhManagerName = yhManagerName;
        this.yhManagerPwd = yhManagerPwd;
    }

    public Manager() {
        super();
    }

    public Integer getYhManagerId() {
        return yhManagerId;
    }

    public void setYhManagerId(Integer yhManagerId) {
        this.yhManagerId = yhManagerId;
    }

    public String getYhManagerName() {
        return yhManagerName;
    }

    public void setYhManagerName(String yhManagerName) {
        this.yhManagerName = yhManagerName;
    }

    public String getYhManagerPwd() {
        return yhManagerPwd;
    }

    public void setYhManagerPwd(String yhManagerPwd) {
        this.yhManagerPwd = yhManagerPwd;
    }
}