package com.heima.quickstart.service;

import com.heima.quickstart.mapper.UserMapper;
import com.heima.quickstart.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public String login(User user) {
        User user1 = userMapper.find(user.getName(), user.getPassword());

        if (user1 == null) {
            // 第一次登录，视为注册
            userMapper.insert(user);
            return "{\"code\":200,\"msg\":\"注册成功\"}";
        } else {
            return "{\"code\":200,\"msg\":\"登录成功\"}";
        }
    }
}