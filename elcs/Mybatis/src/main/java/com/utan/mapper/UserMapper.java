package com.utan.mapper;

import com.utan.pojo.User;
import com.utan.pojo.UserCustomerVo;

import java.util.List;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public interface UserMapper {
    public List<User> getUser(UserCustomerVo userCustomerVo);

    public void addUser(User user);

    //foreach
    public List<User> getUserIds(List<Integer> list);
}
