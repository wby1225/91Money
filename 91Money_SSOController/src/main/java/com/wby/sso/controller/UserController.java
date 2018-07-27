package com.wby.sso.controller;

import com.wby.core.vo.R;
import com.wby.domain.user.User;
import com.wby.sso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService service;

    //注册
    @RequestMapping("/user")
    public R save(User user) {
        return service.save(user);
    }

    //查询全部
    @RequestMapping("/users")
    public List<User> queryAll(){
        return service.queryAll();
    }

    //登陆
    @RequestMapping("/userlogin")
    public R userLogin(){
        return new R();
    }
}
