package com.tt.kaoshi.service;

import com.tt.kaoshi.pojo.Role;
import com.tt.kaoshi.pojo.User;

import java.util.List;

public interface UserService {
    //登录的方法
    User doLogin(String loginName, String password);

    List<Role> getAllRole();
}
