package com.lmj.school.model;

public class Orders {
    private int id;
    private int uid;
    private int investType;
    private double money;
    private long spendtTime;
    private int aid;

    public Orders() {
    }

    public Orders(int id, int uid, int investType, double money, long spendtTime, int aid) {
        this.id = id;
        this.uid = uid;
        this.investType = investType;
        this.money = money;
        this.spendtTime = spendtTime;
        this.aid = aid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getInvestType() {
        return investType;
    }

    public void setInvestType(int investType) {
        this.investType = investType;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public long getSpendtTime() {
        return spendtTime;
    }

    public void setSpendtTime(long spendtTime) {
        this.spendtTime = spendtTime;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", uid=" + uid +
                ", investType=" + investType +
                ", money=" + money +
                ", spendtTime=" + spendtTime +
                ", aid=" + aid +
                '}';
    }
}
