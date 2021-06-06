package com.utan;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class Thread1 extends Thread{

    @Override
    public void run(){
        for(int i =0; i < 10; i++){
            System.out.println(this.getName()+"========="+i);
        }
    }
}
