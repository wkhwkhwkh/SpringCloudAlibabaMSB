package com.tfb;

import com.tfb.pojo.Dog;
import com.tfb.pojo.Pig;
import com.tfb.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
//程序测试
@SpringBootTest
class Springboot1ApplicationTests {

    @Autowired
    private Dog dog;
    @Autowired
    @Qualifier("user")
    private User user;
    @Autowired
    private Pig pig;


    @Test
    void contextLoads() {
        System.out.println(dog);
        System.out.println(user);
        System.out.println(pig);
    }

}
