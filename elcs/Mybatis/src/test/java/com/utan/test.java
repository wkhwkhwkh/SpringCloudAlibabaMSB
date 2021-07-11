package com.utan;

import com.sun.org.apache.xpath.internal.operations.Or;
import com.utan.mapper.OrdersMapperCustom;
import com.utan.mapper.UserMapper;
import com.utan.pojo.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class test {

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
        UserMapper userMapper = session.getMapper(UserMapper.class);
        User user = new User();
        user.setUserName("ly");
        user.setBirthday(new Date());
        user.setSex('F');
        user.setAddress("浙江省");
        userMapper.addUser(user);
        System.out.println(user.getId());
        session.commit();
        session.close();
    }

    @Test
    public void getUser(){
        SqlSession session = sqlSessionFactory.openSession();
        SqlSession session2 = sqlSessionFactory.openSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        UserMapper userMapper2 = session2.getMapper(UserMapper.class);
        UserCustomer userCustomer = new UserCustomer();
        //userCustomer.setUserName("wengkeh");
        UserCustomerVo userCustomerVo = new UserCustomerVo(userCustomer);
        List<User> list = userMapper.getUser(userCustomerVo);
        session.close();
        for(User user : list){
            System.out.println(user);
        }

        userMapper2.getUser(userCustomerVo);
    }

    @Test
    public void getUserByIds(){
        SqlSession session = sqlSessionFactory.openSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(9);
        list.add(8);
        List<User> userList = userMapper.getUserIds(list);
        for(User user : userList){
            System.out.println(user);
        }
    }

    @Test
    public void queryOrderByUserId(){
        SqlSession session = sqlSessionFactory.openSession();
        OrdersMapperCustom ordersMapperCustom = session.getMapper(OrdersMapperCustom.class);
        List<OrderCustom> list = ordersMapperCustom.queryOrderByUserId(26);
        for(OrderCustom o : list){
            System.out.println(o);
        }
        session.close();
    }

    @Test
    public void queryOrderByUserId2(){
        SqlSession session = sqlSessionFactory.openSession();
        OrdersMapperCustom ordersMapperCustom = session.getMapper(OrdersMapperCustom.class);
        List<Orders> list = ordersMapperCustom.queryOrderByUserId2(26);
        for(Orders o : list){
            System.out.println(o);
        }
    }

    @Test
    public void queryOrderAndOrderdetailId2(){
        SqlSession session = sqlSessionFactory.openSession();
        OrdersMapperCustom ordersMapperCustom = session.getMapper(OrdersMapperCustom.class);
        List<Orders> list = ordersMapperCustom.queryOrderAndOrderdetailId2(26);
        for(Orders o : list){
            System.out.println(o);
        }
    }

    @Test
    public void queryUserAndItemResultMap(){
        SqlSession session = sqlSessionFactory.openSession();
        OrdersMapperCustom ordersMapperCustom = session.getMapper(OrdersMapperCustom.class);
        List<User> list = ordersMapperCustom.queryUserAndItemResultMap(26);
        for(User u : list){
            System.out.println(u);
        }
    }
}
