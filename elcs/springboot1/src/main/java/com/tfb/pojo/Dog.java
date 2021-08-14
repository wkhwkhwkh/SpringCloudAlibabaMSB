package com.tfb.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
@Component
@ConfigurationProperties(prefix = "dog")
@Data//使用lombok
public class Dog {

    @Value("wangcai")
    private String name;
    @Value("3")
    private int age;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
