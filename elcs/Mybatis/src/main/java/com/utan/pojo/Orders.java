package com.utan.pojo;

import java.util.Date;
import java.util.List;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class Orders {
    private int id;
    private int userid;
    private String orderid;
    private Date createTime;
    private String note;
    private User user;
    private List<OrderDetail> orderDetails;
    public Orders() {
    }

    public Orders(int id, int userid, String orderid, Date createTime, String note, User user) {
        this.id = id;
        this.userid = userid;
        this.orderid = orderid;
        this.createTime = createTime;
        this.note = note;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", userid=" + userid +
                ", orderid='" + orderid + '\'' +
                ", createTime=" + createTime +
                ", note='" + note + '\'' +
                ", user=" + user +
                '}';
    }
}
