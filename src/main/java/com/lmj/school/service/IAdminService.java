package com.lmj.school.service;

import com.lmj.school.model.Admin;
import com.lmj.school.model.Student;
import com.lmj.school.model.StudentInfo;

import java.util.List;

public interface IAdminService {
    //管理员用户登录
    Admin loginAdmin(Admin admin);
    //管理员录入学生信息
    void saveStudent(Student student);
    //根据学生学号查找学生
    Student findStudentByStudentId(long studentId);
    //初始化余额
    void initBalance(int sid);
    //查找所有的学生学生信息
    List<StudentInfo> findStudentInfo();
}
