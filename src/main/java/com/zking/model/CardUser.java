package com.zking.model;

public class CardUser {
    private Integer yhCardUserId;

    private Integer yhCardId;

    private Integer yhUserUid;

    public CardUser(Integer yhCardUserId, Integer yhCardId, Integer yhUserUid) {
        this.yhCardUserId = yhCardUserId;
        this.yhCardId = yhCardId;
        this.yhUserUid = yhUserUid;
    }

    public CardUser() {
        super();
    }

    public Integer getYhCardUserId() {
        return yhCardUserId;
    }

    public void setYhCardUserId(Integer yhCardUserId) {
        this.yhCardUserId = yhCardUserId;
    }

    public Integer getYhCardId() {
        return yhCardId;
    }

    public void setYhCardId(Integer yhCardId) {
        this.yhCardId = yhCardId;
    }

    public Integer getYhUserUid() {
        return yhUserUid;
    }

    public void setYhUserUid(Integer yhUserUid) {
        this.yhUserUid = yhUserUid;
    }
}