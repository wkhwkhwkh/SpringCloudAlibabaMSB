package com.tfb;

import com.tfb.mapper.PersonMapper;
import com.tfb.pojo.Person;
import com.tfb.userService.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.util.List;

@SpringBootTest
class Springboot02ApplicationTests {

    //HikariDataSource 默认使用HikariDataSource数据源
    @Autowired
    DataSource dataSource;

    @Autowired
    private UserService userService;

    @Autowired
    private PersonMapper personMapper;

    @Test
    void contextLoads() throws Exception{
        /*System.out.println(dataSource);
        Connection c = dataSource.getConnection();
        System.out.println(c);*/
        Person person = userService.queryUser("wengkeh");
        System.out.println(person);
    }

    @Test
    public void fun(){
        Person person = Person.builder().name("wengkehao").age(11).build();
        person = person.toBuilder().name("weng").age(12).build();
        System.out.println(person);
    }

    @Test
    public void fun2(){
        List<Person> list = personMapper.query();
        System.out.println(list);
    }

    @Test
    public void fun4(){
        int count = personMapper.count();
        System.out.println(count);
    }
}
