package com.example.demo.data;

public class UserDetails {

    String nino;
    String awardType;
    String amount;

    public UserDetails(String nino, String awardType, String amount) {
        this.nino = nino;
        this.awardType = awardType;
        this.amount = amount;
    }

    public String getNino() {
        return nino;
    }

    public String getAwardType() {
        return awardType;
    }

    public String getAmount() {
        return amount;
    }

    public void setNino(String nino) {
        this.nino = nino;
    }

    public void setAwardType(String awardType) {
        this.awardType = awardType;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
