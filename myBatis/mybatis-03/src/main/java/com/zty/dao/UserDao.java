package com.zty.dao;

import com.zty.poojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserDao {
    @Select("select * from user")
    List<User>getUser();
}
