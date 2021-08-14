package com.tfb.userService.impl;

import com.tfb.dao.UserDao;
import com.tfb.pojo.Person;
import com.tfb.userService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Person queryUser(String name) {
        Person person = userDao.queryUser(name);
        return person;
    }
}
