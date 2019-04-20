package com.lmj.school.service.impl;

import com.lmj.school.mapper.AdminMapper;
import com.lmj.school.model.Admin;
import com.lmj.school.model.Student;
import com.lmj.school.model.StudentInfo;
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


}
