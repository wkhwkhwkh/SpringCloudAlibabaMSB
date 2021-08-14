package com.tfb.dao;

import com.tfb.pojo.Person;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public interface UserDao {
    public Person queryUser(String name);
}
