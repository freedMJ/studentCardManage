package com.lmj.school.service.impl;

import com.lmj.school.mapper.AdminMapper;
import com.lmj.school.model.*;
import com.lmj.school.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements IAdminService {

    @Autowired
    private AdminMapper adminMapper;
    //管理员用户登录
    @Override
    public Admin loginAdmin(Admin admin) {
        return adminMapper.loginAdmin(admin);
    }
    //管理员录入学生信息
    @Override
    public void saveStudent(Student student) {
        adminMapper.saveStudent(student);
    }
    //根据学生学号查找学生
    @Override
    public Student findStudentByStudentId(long studentId) {
        return adminMapper.findStudentByStudentId(studentId);
    }
    //初始化余额
    @Override
    public void initBalance(int sid) {
        adminMapper.initBalance(sid);
    }
    //查找所有的学生学生信息
    @Override
    public List<StudentInfo> findStudentInfo() {
        return adminMapper.findStudentInfo();
    }
    //保存饭卡订单
    @Override
    public void saveFoodOrders(Orders orders) {
        adminMapper.saveFoodOrders(orders);
    }
    //根据订单类型查找订单列表
    @Override
    public List<OrderInfo> findOrderInfo(int investType) {
        return adminMapper.findOrderInfo(investType);
    }
    //根据订单id查找订单
    @Override
    public Orders findOrderById(int id) {
        return adminMapper.findOrderById(id);
    }
    //根据id查找管理员名;
    @Override
    public String findAdminNameById(int id) {
        return adminMapper.findAdminNameById(id);
    }
    //更新学生饭卡余额
    @Override
    public void updateFoodBalance(double money, int sid) {
        adminMapper.updateFoodBalance(money,sid);
    }
    //保存水卡订单
    @Override
    public void saveHotWaterOrder(Orders orders) {
        adminMapper.saveHotWaterOrder(orders);
    }
    //更新学生水卡余额
    @Override
    public void updateHotWaterBalance(double money, int sid) {
        adminMapper.updateHotWaterBalance(money, sid);
    }
    //查看所有顶单，根据充值时间升序查找
    @Override
    public List<OrderInfo> findAllOrderInfo() {
        return adminMapper.findAllOrderInfo();
    }


}
