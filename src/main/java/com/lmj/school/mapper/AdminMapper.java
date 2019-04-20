package com.lmj.school.mapper;

import com.lmj.school.model.Admin;
import com.lmj.school.model.Student;
import com.lmj.school.model.StudentInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminMapper {
    //管理员用户登录
    Admin loginAdmin(Admin admin);
    //管理员录入学生信息
    void saveStudent(Student student);
    //根据学生学号查找学生
    Student findStudentByStudentId(long studentId);

    //初始化余额
    void initBalance(int sid);
    //设置学生饭卡余额
    void saveFoodCardBalance(@Param("sid") int sid, @Param("foodBalance") int foodBalance );
    //设置学生水卡余额
    void saveHotWaterCardBalance(@Param("sid") int sid, @Param("hotWaterBalance") int hotWaterBalance );
    //查找所有的学生学生信息
    List<StudentInfo> findStudentInfo();

}
