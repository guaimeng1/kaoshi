package com.tt.kaoshi.dao;

import com.tt.kaoshi.pojo.Role;
import com.tt.kaoshi.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer>{

    User findUserByLoginNameAndPassword(String loginName, String password);
}
