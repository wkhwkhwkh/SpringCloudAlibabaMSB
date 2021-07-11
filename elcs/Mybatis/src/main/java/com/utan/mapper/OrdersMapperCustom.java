package com.utan.mapper;

import com.utan.pojo.OrderCustom;
import com.utan.pojo.Orders;
import com.utan.pojo.User;

import java.util.List;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public interface OrdersMapperCustom {
    public List<OrderCustom> queryOrderByUserId(int id);

    public List<Orders> queryOrderByUserId2(int id);

    public List<Orders> queryOrderAndOrderdetailId2(int id);

    public List<User> queryUserAndItemResultMap(int id);
}
