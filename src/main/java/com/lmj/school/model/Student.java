package com.lmj.school.model;

public class Student {
    private int id;
    private String studentName;
    private String major;
    private int sex;
    private String grade;
    private long studentId;

    public Student() {
    }

    public Student(int id, String studentName, String major, int sex, String grade, long studentId) {
        this.id = id;
        this.studentName = studentName;
        this.major = major;
        this.sex = sex;
        this.grade = grade;
        this.studentId = studentId;
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", major='" + major + '\'' +
                ", sex=" + sex +
                ", grade='" + grade + '\'' +
                ", studentId=" + studentId +
                '}';
    }
}
