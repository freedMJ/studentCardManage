package com.lmj.school.model;

public class StudentInfo {
    private int id;
    private String studentName;
    private String major;
    private int sex;
    private String grade;
    private long studentId;
    private double hotWaterBalance;
    private double foodBalance;

    public StudentInfo() {
    }

    public StudentInfo(int id, String studentName, String major, int sex, String grade, long studentId, double hotWaterBalance, double foodBalance) {
        this.id = id;
        this.studentName = studentName;
        this.major = major;
        this.sex = sex;
        this.grade = grade;
        this.studentId = studentId;
        this.hotWaterBalance = hotWaterBalance;
        this.foodBalance = foodBalance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
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
        return "StudentInfo{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", major='" + major + '\'' +
                ", sex=" + sex +
                ", grade='" + grade + '\'' +
                ", studentId=" + studentId +
                ", hotWaterBalance=" + hotWaterBalance +
                ", foodBalance=" + foodBalance +
                '}';
    }
}
