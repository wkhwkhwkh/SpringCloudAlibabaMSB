package com.utan10;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class Product {
    private String brand;//品牌

    private String name;//名字

    boolean flag = false;//默认先让生产者生产

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public synchronized void setProduct(String brand,String name){
        if(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setBrand(brand);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setName(name);
        System.out.println("生产者生产了" + this.getBrand() + "==========" + this.getName());


        flag = true;
        notify();
    }

    public synchronized void getProduct(){
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费者消费了" + this.getBrand() + "=======" + this.getName());

        flag = false;

        notify();
    }
}
