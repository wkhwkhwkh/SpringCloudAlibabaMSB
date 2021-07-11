package com.utan.pojo;

import java.io.Serializable;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 * Orders的扩展类,用来映射用户和订单
 */
public class OrderCustom extends Orders implements Serializable {
    private String userName;
    private char sex;
    private String address;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
