package com.lmj.school.model;

public class Balance {
    private int id;
    private int sid;
    private double hotWaterBalance;
    private double foodBalance;

    public Balance() {
    }

    public Balance(int id, int sid, double hotWaterBalance, double foodBalance) {
        this.id = id;
        this.sid = sid;
        this.hotWaterBalance = hotWaterBalance;
        this.foodBalance = foodBalance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public double getHotWaterBalance() {
        return hotWaterBalance;
    }

    public void setHotWaterBalance(double hotWaterBalance) {
        this.hotWaterBalance = hotWaterBalance;
    }

    public double getFoodBalance() {
        return foodBalance;
    }

    public void setFoodBalance(double foodBalance) {
        this.foodBalance = foodBalance;
    }

    @Override
    public String toString() {
        return "Balance{" +
                "id=" + id +
                ", sid=" + sid +
                ", hotWaterBalance=" + hotWaterBalance +
                ", foodBalance=" + foodBalance +
                '}';
    }
}
