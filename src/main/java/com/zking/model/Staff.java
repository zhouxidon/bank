package com.zking.model;

public class Staff {
    private Integer yhStaffId;

    private String yhUserZh;

    private String yhStaffPwd;

    private String yhStaffSex;

    private String yhStaffAddress;

    private String yhStaffPhone;

    private Integer yhStaffWage;

    private String yhStaffIdcard;

    public Staff(Integer yhStaffId, String yhUserZh, String yhStaffPwd, String yhStaffSex, String yhStaffAddress, String yhStaffPhone, Integer yhStaffWage, String yhStaffIdcard) {
        this.yhStaffId = yhStaffId;
        this.yhUserZh = yhUserZh;
        this.yhStaffPwd = yhStaffPwd;
        this.yhStaffSex = yhStaffSex;
        this.yhStaffAddress = yhStaffAddress;
        this.yhStaffPhone = yhStaffPhone;
        this.yhStaffWage = yhStaffWage;
        this.yhStaffIdcard = yhStaffIdcard;
    }

    public Staff() {
        super();
    }

    public Integer getYhStaffId() {
        return yhStaffId;
    }

    public void setYhStaffId(Integer yhStaffId) {
        this.yhStaffId = yhStaffId;
    }

    public String getYhUserZh() {
        return yhUserZh;
    }

    public void setYhUserZh(String yhUserZh) {
        this.yhUserZh = yhUserZh;
    }

    public String getYhStaffPwd() {
        return yhStaffPwd;
    }

    public void setYhStaffPwd(String yhStaffPwd) {
        this.yhStaffPwd = yhStaffPwd;
    }

    public String getYhStaffSex() {
        return yhStaffSex;
    }

    public void setYhStaffSex(String yhStaffSex) {
        this.yhStaffSex = yhStaffSex;
    }

    public String getYhStaffAddress() {
        return yhStaffAddress;
    }

    public void setYhStaffAddress(String yhStaffAddress) {
        this.yhStaffAddress = yhStaffAddress;
    }

    public String getYhStaffPhone() {
        return yhStaffPhone;
    }

    public void setYhStaffPhone(String yhStaffPhone) {
        this.yhStaffPhone = yhStaffPhone;
    }

    public Integer getYhStaffWage() {
        return yhStaffWage;
    }

    public void setYhStaffWage(Integer yhStaffWage) {
        this.yhStaffWage = yhStaffWage;
    }

    public String getYhStaffIdcard() {
        return yhStaffIdcard;
    }

    public void setYhStaffIdcard(String yhStaffIdcard) {
        this.yhStaffIdcard = yhStaffIdcard;
    }
}