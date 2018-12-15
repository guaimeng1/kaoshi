package com.tt.kaoshi.controller;

import com.tt.kaoshi.pojo.Role;
import com.tt.kaoshi.pojo.User;
import com.tt.kaoshi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * #作者：zhangshuai
 * #时间：2018/11/24 14:37
 * #描述：用户控制器
*/
@Controller
public class UserController {
    @Autowired
    @Qualifier("userService")
    private UserService userService;
    //登录页面的请求
    @GetMapping("/login")
    public String login() {
        return "login";
    }
    //登录的方法

    @PostMapping("/doLogin")
    public ModelAndView doLogin(@RequestParam String loginName,@RequestParam String password) {
        User user=userService.doLogin(loginName,password);
        if (user!=null){
            return studentList();
        }
        return new ModelAndView("login");
    }
    //获取角色页面信息的方法
    @GetMapping("/getAll")
    @ResponseBody
    public List<Role> getAll() {
        List<Role> list = userService.getAllRole();
        return list;
    }
    //获取查询角色页面信息的数据遍历到页面
    @GetMapping("/findRole")
    public ModelAndView studentList() {
        ModelAndView modelAndView=new ModelAndView();
        List<Role> list = getAll();
        modelAndView.setViewName("findRole");
        modelAndView.addObject("list",list);
        return modelAndView;
    }

}
