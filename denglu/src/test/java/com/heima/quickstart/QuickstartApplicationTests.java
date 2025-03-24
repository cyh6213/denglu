package com.heima.quickstart;

import com.heima.quickstart.mapper.UserMapper;
import com.heima.quickstart.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class QuickstartApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    void testinsert(){
        User user = new User();
        user.setName("aa");
        user.setPassword("123");

        userMapper.insert(user);
    }



}
