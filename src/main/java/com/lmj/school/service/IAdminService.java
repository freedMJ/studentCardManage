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
    //根据订单类型查找订单列表
    List<OrderInfo> findOrderInfo(int investType);
    //根据订单id查找订单
    Orders findOrderById(int id);
    //根据id查找管理员名;
    String findAdminNameById(int id);
    //更新学生饭卡余额
    void updateFoodBalance(double money,int sid);
    //保存水卡订单
    void saveHotWaterOrder(Orders orders);
    //更新学生水卡余额
    void updateHotWaterBalance( double money, int sid);
    //查看所有顶单，根据充值时间升序查找
    List<OrderInfo> findAllOrderInfo();

}
