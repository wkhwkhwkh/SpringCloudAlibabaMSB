package com.tfb.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
@Component
@ConfigurationProperties(value = "a")
public class Pig {
    private String sex;

    public Pig() {
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "sex='" + sex + '\'' +
                '}';
    }
}
