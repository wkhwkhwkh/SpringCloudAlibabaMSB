package com.utan;

import com.utan.mapper.UserMapper1;
import com.utan.pojo.User1;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestUser {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws IOException {
        String resources = "sqlMapConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resources);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void addUser(){
        SqlSession session = sqlSessionFactory.openSession();
        UserMapper1 userMapper = session.getMapper(UserMapper1.class);
        for(int i = 0; i < 10000; i++){
            User1 user = new User1(i,Integer.valueOf(i).toString(),i);
            userMapper.add(user);
            session.commit();
        }
    }
}
