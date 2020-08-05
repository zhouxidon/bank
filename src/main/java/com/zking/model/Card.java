package com.zking.model;

public class Card {
    private Integer yhCardId;

    private String yhCardBankcart;

    private Float yhCardMoney;

    private String yhCardPwd;

    private Integer yhCardStatus;

    public Card(Integer yhCardId, String yhCardBankcart, Float yhCardMoney, String yhCardPwd, Integer yhCardStatus) {
        this.yhCardId = yhCardId;
        this.yhCardBankcart = yhCardBankcart;
        this.yhCardMoney = yhCardMoney;
        this.yhCardPwd = yhCardPwd;
        this.yhCardStatus = yhCardStatus;
    }

    public Card() {
        super();
    }

    public Integer getYhCardId() {
        return yhCardId;
    }

    public void setYhCardId(Integer yhCardId) {
        this.yhCardId = yhCardId;
    }

    public String getYhCardBankcart() {
        return yhCardBankcart;
    }

    public void setYhCardBankcart(String yhCardBankcart) {
        this.yhCardBankcart = yhCardBankcart;
    }

    public Float getYhCardMoney() {
        return yhCardMoney;
    }

    public void setYhCardMoney(Float yhCardMoney) {
        this.yhCardMoney = yhCardMoney;
    }

    public String getYhCardPwd() {
        return yhCardPwd;
    }

    public void setYhCardPwd(String yhCardPwd) {
        this.yhCardPwd = yhCardPwd;
    }

    public Integer getYhCardStatus() {
        return yhCardStatus;
    }

    public void setYhCardStatus(Integer yhCardStatus) {
        this.yhCardStatus = yhCardStatus;
    }
}