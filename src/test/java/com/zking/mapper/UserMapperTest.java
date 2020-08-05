package com.zking.mapper;

import com.zking.model.User;
import com.zking.util.MybatisSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class UserMapperTest {

    private User u;
    private UserMapper um;
    private SqlSession sqlSession;

    @Before
    public void setUp() throws Exception {
        u = new User();
        sqlSession = MybatisSessionFactoryUtils.openSession();
        um = sqlSession.getMapper(UserMapper.class);
    }

    @Test
    public void insertSelective() {
        u.setYhUserName("李四");
        u.setYhUserSex("女");
        u.setYhUserAddress("浪琴湾");
        u.setYhUserPhone("13874741438");
        u.setYhUserIdcard("430621200103212781");
        u.setYhUserPwd("456");
        u.setYhUserZh("wdnmd");
        um.insertSelective(u);
    }

    @Test
    public void AllUser(){
        List<User> ALLUSER = um.alluser();
        for (User user : ALLUSER) {
            System.out.println(user);
        }

    }
    @After
    public void after(){
        sqlSession.commit();
    }
}