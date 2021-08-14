package com.utan;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class BeanTest {

    @Test
    public void fun(){
        //加载配置文件
        ApplicationContext apply = new ClassPathXmlApplicationContext("application.xml");
        User user = (User)apply.getBean("user");
        user.fun();
        System.out.println(user);

        //User user2 = (User)apply.getBean("student");
        //System.out.println(user2);
    }
}
