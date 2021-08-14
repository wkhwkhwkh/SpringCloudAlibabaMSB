package com.tfb.controller;

import java.util.Observable;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */

/**
 * springWebflux
 */
public class ObserverDemo extends Observable {
    //main方法，程序入口
    public static void main(String[] args) {
        ObserverDemo demo = new ObserverDemo();
        //添加观察者
        demo.addObserver((o,arg)->{
            System.out.println("发生变化!");
        });

        demo.addObserver((o,arg)->{
            System.out.println("收到被观察者通知，准备改变!!");
        });
        demo.setChanged();//数据变化
        demo.notifyObservers();//通知
    }
}
