package com.example.service;

import com.example.bean.UserInfo;


public interface UserInfoService {
    /**
     * 添加
     * @param userInfo
     * @return  添加成功返回true,否则返回false
     */
    public  boolean save(UserInfo userInfo);
}
