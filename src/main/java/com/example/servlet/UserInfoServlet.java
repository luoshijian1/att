package com.example.servlet;

import com.example.bean.UserInfo;
import com.example.service.UserInfoService;
import com.example.service.impl.UserInfoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserInfoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置post请求的乱码问题（以后使用Filter实现）
        req.setCharacterEncoding("UTF-8");
        //接收页面提交的数据
        String account = req.getParameter("account");
        String password = req.getParameter("password");
        String name = req.getParameter("name");
        //封装数据到Bean
        UserInfo userInfo= new UserInfo();
        userInfo.setAccount(account);
        userInfo.setPassword(password);
        userInfo.setName(name);
        //调用Service
        UserInfoService userInfoService= new UserInfoServiceImpl();
        boolean flag = userInfoService.save(userInfo);
        if(flag){
            System.out.println("成功");
        }else{
            System.out.println("失败");
        }


        System.out.println("github");
         System.out.println("github pull");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
