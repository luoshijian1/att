package com.example.service.impl;

import com.example.bean.UserInfo;
import com.example.dao.UserInfoDao;
import com.example.dao.impl.UserInfoDaoImpl;
import com.example.service.UserInfoService;

public class UserInfoServiceImpl implements UserInfoService {

    private UserInfoDao userInfoDao;

    /**
     * 创建DAO的对象
     */
    public UserInfoServiceImpl() {
        this.userInfoDao = new UserInfoDaoImpl();
    }

    @Override
    public boolean save(UserInfo userInfo) {
        int save = userInfoDao.save(userInfo);
        return save==0 ? false : true;
    }

}
