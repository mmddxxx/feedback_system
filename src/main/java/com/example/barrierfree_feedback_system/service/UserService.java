package com.example.barrierfree_feedback_system.service;


import com.example.barrierfree_feedback_system.common.vo.Result;

public interface UserService {

    //用户注册
    public Result userResgit(String name, String pwd);

    //用户登录
    public Result checkLogin(String name, String pwd);

}
