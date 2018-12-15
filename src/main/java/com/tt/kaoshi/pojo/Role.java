package com.tt.kaoshi.pojo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * #作者：zhangshuai
 * #时间：2018/11/24 14:33
 * #描述：角色类Role   对应role表
*/
@Entity
@Table(name = "role")
public class Role implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   private String roleName;
   private String roleShu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleShu() {
        return roleShu;
    }

    public void setRoleShu(String roleShu) {
        this.roleShu = roleShu;
    }

    public Role() {
    }

    public Role(Integer id, String roleName, String roleShu) {
        this.id = id;
        this.roleName = roleName;
        this.roleShu = roleShu;
    }
}
