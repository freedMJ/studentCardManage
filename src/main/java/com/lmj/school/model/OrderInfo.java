package com.lmj.school.model;

public class OrderInfo {
    //学生部分
    /**
     * 姓名
     * 性别
     * 学号
     * 专业
     * 年级
     * 充值时间
     * 订单种类
     * 充值金额
     * 充值人
     * 订单id
     * **/
    private int id;
    private String studentName;
    private int sex;
    private long studentId;
    private String major;
    private String grade;
    private long spendTime;
    private int investType;
    private double money;
    private int aid;
    private String adminName;

    public OrderInfo() {
    }

    public OrderInfo(int id, String studentName, int sex, long studentId, String major, String grade, long spendTime, int investType, double money, int aid, String adminName) {
        this.id = id;
        this.studentName = studentName;
        this.sex = sex;
        this.studentId = studentId;
        this.major = major;
        this.grade = grade;
        this.spendTime = spendTime;
        this.investType = investType;
        this.money = money;
        this.aid = aid;
        this.adminName = adminName;
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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public long getSpendTime() {
        return spendTime;
    }

    public void setSpendTime(long spendTime) {
        this.spendTime = spendTime;
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

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", sex=" + sex +
                ", studentId=" + studentId +
                ", major='" + major + '\'' +
                ", grade='" + grade + '\'' +
                ", spendTime=" + spendTime +
                ", investType=" + investType +
                ", money=" + money +
                ", aid=" + aid +
                ", adminName='" + adminName + '\'' +
                '}';
    }
}
