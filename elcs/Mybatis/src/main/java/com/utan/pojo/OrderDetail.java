package com.utan.pojo;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class OrderDetail {
    private int id;

    private int orderId;

    private int itemsid;

    private int itemnum;

    private Items item;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getItemsid() {
        return itemsid;
    }

    public void setItemsid(int itemsid) {
        this.itemsid = itemsid;
    }

    public int getItemnum() {
        return itemnum;
    }

    public void setItemnum(int itemnum) {
        this.itemnum = itemnum;
    }

    public Items getItem() {
        return item;
    }

    public void setItem(Items item) {
        this.item = item;
    }
}
