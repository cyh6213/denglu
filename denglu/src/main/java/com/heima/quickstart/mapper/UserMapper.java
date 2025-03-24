package com.heima.quickstart.mapper;



import com.heima.quickstart.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;;

import java.util.List;

@Mapper
public  interface UserMapper {

    @Select("select * from user where name=#{name}and password=#{password}")
    public User find(String name,String password);

    @Insert("insert into user( name, password)\n" +
            "values (#{name},#{password})")
    public void insert(User user);
}