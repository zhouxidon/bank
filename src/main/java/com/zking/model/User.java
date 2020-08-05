package com.zking.model;

public class User {
    private Integer yhUserUid;

    private String yhUserName;

    private String yhUserSex;

    private String yhUserAddress;

    private String yhUserPhone;

    private String yhUserIdcard;

    private String yhUserPwd;

    private String yhUserZh;

    public User(Integer yhUserUid, String yhUserName, String yhUserSex, String yhUserAddress, String yhUserPhone, String yhUserIdcard, String yhUserPwd, String yhUserZh) {
        this.yhUserUid = yhUserUid;
        this.yhUserName = yhUserName;
        this.yhUserSex = yhUserSex;
        this.yhUserAddress = yhUserAddress;
        this.yhUserPhone = yhUserPhone;
        this.yhUserIdcard = yhUserIdcard;
        this.yhUserPwd = yhUserPwd;
        this.yhUserZh = yhUserZh;
    }

    public User() {
        super();
    }

    public Integer getYhUserUid() {
        return yhUserUid;
    }

    public void setYhUserUid(Integer yhUserUid) {
        this.yhUserUid = yhUserUid;
    }

    public String getYhUserName() {
        return yhUserName;
    }

    public void setYhUserName(String yhUserName) {
        this.yhUserName = yhUserName;
    }

    public String getYhUserSex() {
        return yhUserSex;
    }

    public void setYhUserSex(String yhUserSex) {
        this.yhUserSex = yhUserSex;
    }

    public String getYhUserAddress() {
        return yhUserAddress;
    }

    public void setYhUserAddress(String yhUserAddress) {
        this.yhUserAddress = yhUserAddress;
    }

    public String getYhUserPhone() {
        return yhUserPhone;
    }

    public void setYhUserPhone(String yhUserPhone) {
        this.yhUserPhone = yhUserPhone;
    }

    public String getYhUserIdcard() {
        return yhUserIdcard;
    }

    public void setYhUserIdcard(String yhUserIdcard) {
        this.yhUserIdcard = yhUserIdcard;
    }

    public String getYhUserPwd() {
        return yhUserPwd;
    }

    public void setYhUserPwd(String yhUserPwd) {
        this.yhUserPwd = yhUserPwd;
    }

    public String getYhUserZh() {
        return yhUserZh;
    }

    public void setYhUserZh(String yhUserZh) {
        this.yhUserZh = yhUserZh;
    }
}