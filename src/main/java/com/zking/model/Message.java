package com.zking.model;

public class Message {
    private Integer yhMessageId;

    private String yhMessageInfo;

    private Integer yhUserUid;

    public Message(Integer yhMessageId, String yhMessageInfo, Integer yhUserUid) {
        this.yhMessageId = yhMessageId;
        this.yhMessageInfo = yhMessageInfo;
        this.yhUserUid = yhUserUid;
    }

    public Message() {
        super();
    }

    public Integer getYhMessageId() {
        return yhMessageId;
    }

    public void setYhMessageId(Integer yhMessageId) {
        this.yhMessageId = yhMessageId;
    }

    public String getYhMessageInfo() {
        return yhMessageInfo;
    }

    public void setYhMessageInfo(String yhMessageInfo) {
        this.yhMessageInfo = yhMessageInfo;
    }

    public Integer getYhUserUid() {
        return yhUserUid;
    }

    public void setYhUserUid(Integer yhUserUid) {
        this.yhUserUid = yhUserUid;
    }
}