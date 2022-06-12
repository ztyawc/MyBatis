package com.zty.dao;

import com.zty.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    //查询全部用户
    List<User> getUserList();
    //根据ID查询用户
    User getUserById(int id);
    //添加用户
    int addUser(User user);
    //删除用户
    int rmUser(int id);
    //更新用户
    int setUser(User user);
    //根据名字查询用户
    User getUserById1(String name);
    //map根据名字查用户
    User mapGetUser(Map<String,Object>map);
    //分页查询
    List<User> getUserByLimit(Map<String,Object>map);
}
