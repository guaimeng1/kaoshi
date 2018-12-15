package com.tt.kaoshi.service.impl;

import com.tt.kaoshi.dao.RoleDao;
import com.tt.kaoshi.dao.UserDao;
import com.tt.kaoshi.pojo.Role;
import com.tt.kaoshi.pojo.User;
import com.tt.kaoshi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService{
    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;
    @Autowired
    @Qualifier("roleDao")
    private RoleDao roleDao;
    //登录的方法
    public User doLogin(String loginName, String password) {
        return userDao.findUserByLoginNameAndPassword(loginName,password);
    }

    //查询角色信息的方法
    public List<Role> getAllRole() {
        return (List<Role>) roleDao.findAll();
    }



}
