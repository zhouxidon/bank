package com.zking.model;

public class Stafftype {
    private Integer yhStafftypeId;

    private String yhStafftypeType;

    public Stafftype(Integer yhStafftypeId, String yhStafftypeType) {
        this.yhStafftypeId = yhStafftypeId;
        this.yhStafftypeType = yhStafftypeType;
    }

    public Stafftype() {
        super();
    }

    public Integer getYhStafftypeId() {
        return yhStafftypeId;
    }

    public void setYhStafftypeId(Integer yhStafftypeId) {
        this.yhStafftypeId = yhStafftypeId;
    }

    public String getYhStafftypeType() {
        return yhStafftypeType;
    }

    public void setYhStafftypeType(String yhStafftypeType) {
        this.yhStafftypeType = yhStafftypeType;
    }
}