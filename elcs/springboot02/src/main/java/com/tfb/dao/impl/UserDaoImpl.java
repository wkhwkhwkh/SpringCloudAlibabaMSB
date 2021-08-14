package com.tfb.dao.impl;

import com.tfb.dao.UserDao;
import com.tfb.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
@Repository(value="userDao")
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Person queryUser(String name) {
        List<Person> list = jdbcTemplate.query("select * from tfb_user where name = ?", new Object[]{name}, new BeanPropertyRowMapper(Person.class));
        if(list!=null && list.size()>0){
            return list.get(0);
        }else{
            return null;
        }
    }
}
