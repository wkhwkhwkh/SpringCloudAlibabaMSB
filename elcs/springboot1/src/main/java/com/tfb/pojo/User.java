package com.tfb.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import sun.nio.cs.ext.IBM037;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
@Component
//@PropertySource(value = "classpath:tfb.properties")
@ConfigurationProperties(prefix = "user")
@Validated//数据校验
public class User {
    //User{name='26503', age=12, flag=true, date=Sat Dec 12 00:00:00 CST 2020,
    // map={k1=v1, k2=v2}, list=[code, study, girl],
    // dog=Dog{name='wangcai1', age=4}}
    private String name;

    private int age;
    private boolean flag;
    private Date date;
    private Map<String,Object> map;
    private List<Object> list;
    @Autowired
    private Dog dog;

    public User() {
    }

    public User(String name, int age, boolean flag, Date date, Map<String, Object> map, List<Object> list, Dog dog) {
        this.name = name;
        this.age = age;
        this.flag = flag;
        this.date = date;
        this.map = map;
        this.list = list;
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", flag=" + flag +
                ", date=" + date +
                ", map=" + map +
                ", list=" + list +
                ", dog=" + dog +
                '}';
    }
}
