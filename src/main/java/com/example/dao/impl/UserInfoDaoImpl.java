package com.example.dao.impl;

import com.example.bean.UserInfo;
import com.example.dao.UserInfoDao;

import java.sql.*;

public class UserInfoDaoImpl implements UserInfoDao {
    @Override
    public int save(UserInfo userInfo) {
        Connection connection=null;
        PreparedStatement pre=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/att","root","123456");
            String sql="insert  into t_user_info (account,password,name)values(?,?,?)";
            pre=connection.prepareStatement(sql);
            pre.setString(1,userInfo.getAccount());
            pre.setString(2,userInfo.getPassword());
            pre.setString(3,userInfo.getName());

            return pre.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(pre!=null){
                try {
                    pre.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return 0;
    }
}
