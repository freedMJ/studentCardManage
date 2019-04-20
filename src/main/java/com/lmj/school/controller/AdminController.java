package com.lmj.school.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lmj.school.model.*;
import com.lmj.school.service.IAdminService;
import com.lmj.school.untis.MyConstant;
import com.lmj.school.untis.PageNumsList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class AdminController {
    @Autowired
    private IAdminService adminService;

    //管理账号登录
    @GetMapping("login")
    public String login(){
        return "admin/login";
    }

    @PostMapping("login")
    @ResponseBody
    public Map<String,String> login(@RequestBody Admin admin, HttpSession session){
        Admin loginAdmin = adminService.loginAdmin(admin);
        Map<String,String> map = new HashMap<>();
        String msg = null;
        if(loginAdmin!=null){
            msg="success";
            session.setAttribute("user",loginAdmin);
        }else{
            msg="error";
        }
        map.put("msg",msg);
        return map;

    }
    //用户退出
    @GetMapping("userOut")
    public String userOut(HttpSession session){
        session.removeAttribute("user");
        return "admin/login";
    }
    //访问首页
    @GetMapping("index")
    public String index(){
        return "admin/index";
    }
    //录入学生信息
    @GetMapping("investStudentInfo")
    public String investStudentInfo(){
        return "admin/investStudentInfo";
    }
    @PostMapping("investStudentInfo")
    @ResponseBody
    public Map<String,String> login(@RequestBody Student student){
        String msg =null;
        Map<String,String> map = new HashMap<>();
        //根据学号判断是否已经存在该学号
        Student studentByStudentId = adminService.findStudentByStudentId(student.getStudentId());
        if(studentByStudentId!=null){
            msg="该学号已经存在，请重新录入";
        }else{
            adminService.saveStudent(student);
            //根据学号查找id
            Student saveStudent = adminService.findStudentByStudentId(student.getStudentId());
            adminService.initBalance(saveStudent.getId());
            msg="success";
        }
        map.put("msg",msg);
        return map;
    }
    //保存学生信息成功页面
    @GetMapping("successSaveStudentInfo")
    public String successSaveStudentInfo(){
        return "admin/successSaveStudentInfo";
    }
    //学生信息管理
    @GetMapping("studentManager")
    public String studentManager(Model model, @RequestParam(name = "pageNum",defaultValue = "1")int pageNum){
        PageHelper.startPage(pageNum, MyConstant.PAGESIZE);
        List<StudentInfo> studentInfo = adminService.findStudentInfo();
        PageInfo<StudentInfo> pageInfo = new PageInfo<>(studentInfo);
        int pages = pageInfo.getPages();//查询总数
        //设置一个页面最多允许5个分页

        PageNumsList pageNumsList = new PageNumsList();
        int[] pageNumArray = pageNumsList.getPageNumArray(pageNum, pages);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("pageNumArray",pageNumArray);
        model.addAttribute("pageNum",pageNum);
        model.addAttribute("pages",pages);
        return "admin/studentManager";
    }
    //饭卡充值
    @GetMapping("investFood")
    public String investFood(){
        return "admin/investFood";
    }
    @PostMapping("investFood")
    @ResponseBody
    public Map<String,String> investFood(@RequestBody Orders orders,HttpSession session){
        //根据学号查学生
        System.out.println(orders);
        String msg=null;
        Student student = adminService.findStudentByStudentId(orders.getStudentId());
        if(student==null){
            msg="该学生不存在";
        }else{
            //得到当前时间
            long time = new Date().getTime()/1000;
            orders.setSpendTime(time);
            orders.setInvestType(1);
            Admin user = (Admin) session.getAttribute("user");
            orders.setAid(user.getId());
            adminService.saveFoodOrders(orders);
            msg="success";
        }
        Map<String,String> map =new HashMap<>();
        map.put("msg",msg);
        return map;
    }
    //充值成功
    @GetMapping("successInvest")
    public String successInvest(){
        return "admin/successInvest";
    }
    //查看充值饭卡订单
    @GetMapping("findFoodOrder")
    public String findFoodOrder(Model model,@RequestParam(name="pageNum",defaultValue = "1")int pageNum){
        //分页
        PageHelper.startPage(pageNum,MyConstant.PAGESIZE);
        List<OrderInfo> orderInfo = adminService.findOrderInfo();
        PageInfo<OrderInfo> orderInfoPageInfo = new PageInfo<>(orderInfo);
        int pages = orderInfoPageInfo.getPages();//查询总数
        //设置一个页面最多允许5个分页
        PageNumsList pageNumsList = new PageNumsList();
        System.out.println(orderInfoPageInfo.getList());
        int[] pageNumArray = pageNumsList.getPageNumArray(pageNum, pages);
        model.addAttribute("orderInfoPageInfo",orderInfoPageInfo);
        model.addAttribute("pageNumArray",pageNumArray);
        model.addAttribute("pageNum",pageNum);
        model.addAttribute("pages",pages);
        return "admin/findFoodOrder";
    }
    //查看订单详情
    @GetMapping("detailsInfo")
    public String foodDetailsInfo(Model model,@RequestParam(name="id",defaultValue = "0")int id){
        if(id!=0){
            //根据订单id查找订单
            Orders order = adminService.findOrderById(id);
            //根据学号查找学生信息
            Student student = adminService.findStudentByStudentId(order.getStudentId());
            OrderInfo orderInfo = new OrderInfo();
            orderInfo.setStudentName(student.getStudentName());
            orderInfo.setSex(student.getSex());
            orderInfo.setStudentId(student.getStudentId());
            orderInfo.setMajor(student.getMajor());
            orderInfo.setGrade(student.getGrade());
            orderInfo.setSpendTime(order.getSpendTime());
            orderInfo.setInvestType(order.getInvestType());
            orderInfo.setMoney(order.getMoney());
            //根据id查找管理员名;
            String adminName = adminService.findAdminNameById(order.getAid());
            orderInfo.setAid(order.getAid());
            orderInfo.setAdminName(adminName);
            System.out.println(orderInfo);
            model.addAttribute("orderInfo",orderInfo);
        }
        return "admin/detailsInfo";
    }

}
