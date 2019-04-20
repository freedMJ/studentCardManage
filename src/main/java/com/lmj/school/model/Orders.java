package com.lmj.school.model;

public class Orders {
    private int id;
    private long studentId;
    private int investType;
    private double money;
    private long spendTime;
    private int aid;

    public Orders() {
    }

    public Orders(int id, long studentId, int investType, double money, long spendtTime, int aid) {
        this.id = id;
        this.studentId = studentId;
        this.investType = investType;
        this.money = money;
        this.spendTime = spendtTime;
        this.aid = aid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
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

    public long getSpendTime() {
        return spendTime;
    }

    public void setSpendTime(long spendTime) {
        this.spendTime = spendTime;
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
                ", studentId=" + studentId +
                ", investType=" + investType +
                ", money=" + money +
                ", spendtTime=" + spendTime +
                ", aid=" + aid +
                '}';
    }
}
