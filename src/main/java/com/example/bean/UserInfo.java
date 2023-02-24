package com.example.bean;

import lombok.Data;

import java.util.Date;

@Data
public class UserInfo {
    private Integer id;
    private String account;
    private String password;
    private String name;
    private Integer dept_id;
    private String sex;
    private Date birthday;
    private String mobile;
    private String email;
    private String User_type;
    private String mylevel;
    private Date create_time;
    private String state;
}
