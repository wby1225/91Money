package com.wby.mapper.user;

import com.wby.domain.user.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Insert("insert into t_user (username,password,phone,uid) values (#{username},#{password},#{phone},#{uid})")
    int insert(User user);

    @Select("seletc * from t_user")
    @ResultType(User.class)
    List<User> queryAll();

    @Select("select * from t_user where username=#{name} or phone=#{name}")
    @ResultType(User.class)
    User queryByName(String name);
}
