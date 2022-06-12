package com.zty.dao;

import com.zty.pojo.User;
import com.zty.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {
    //查询所有用户
    @Test
    public void test(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }
    //根据id查询用户
    @Test
    public void testgetUserById(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User user = mapper.getUserById(2);
        System.out.println(user);
        sqlSession.close();
    }
    //添加用户
    @Test
    public void addUser(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        mapper.addUser(new User(6,"反对","123"));
        sqlSession.commit();
        sqlSession.close();
    }
    //删除用户
    @Test
    public void rmUser(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        mapper.rmUser(1);
        sqlSession.commit();
        sqlSession.close();
    }
    //根据id修改id
    @Test
    public void testSet(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        mapper.setUser(new User(2,"sd","33"));
        sqlSession.commit();
        sqlSession.close();
    }
    //根据名字查询用户
    @Test
    public void testgetUserById1(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User user = mapper.getUserById1("张天宇");
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    //map根据名字查用户
    public void mapGetUser(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        Map<String,Object>map=new HashMap<String,Object>();
        map.put("name1","张天宇");
        User user = mapper.mapGetUser(map);
        System.out.println(user);
        sqlSession.close();
    }
}
