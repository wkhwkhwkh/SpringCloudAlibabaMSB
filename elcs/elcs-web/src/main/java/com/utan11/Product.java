package com.utan11;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class Product {
    private String brand;//品牌

    private String name;//名字

    boolean flag = false;//默认先让生产者生产

    //lock锁
    Lock lock = new ReentrantLock();
    //创建一个生产者的等待队列
    Condition proCondition = lock.newCondition();
    //创建一个消费者的等待队列
    Condition cusCondition = lock.newCondition();

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

    public void setProduct(String brand,String name){
        lock.lock();
        try{
            if(flag){
                try {
                    //wait();
                    proCondition.await();
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
            //notify();
            cusCondition.signal();
        }finally{
            lock.unlock();
        }
    }

    public void getProduct(){
        lock.lock();
        try{
            if(!flag){
                try {
                    //wait();
                    cusCondition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("消费者消费了" + this.getBrand() + "=======" + this.getName());

            flag = false;
            //notify();
            proCondition.signal();
        }finally{
            lock.unlock();
        }
    }
}
