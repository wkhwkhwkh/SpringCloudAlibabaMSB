package com.utan;

import java.text.SimpleDateFormat;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class Thread6 extends Thread{

    public Thread6(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println(this.getName()+"====="+i);
        }
    }
}

class TestThread6{
    //main方法，程序入口
    public static void main(String[] args){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("你是谁?");
    }
}
