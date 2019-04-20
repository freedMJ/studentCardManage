package com.lmj.school.service;

import com.lmj.school.model.*;

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
    //保存饭卡订单
    void saveFoodOrders(Orders orders);
    //发现饭卡订单
    List<OrderInfo> findOrderInfo();
    //根据订单id查找订单
    Orders findOrderById(int id);
    //根据id查找管理员名;
    String findAdminNameById(int id);
}
