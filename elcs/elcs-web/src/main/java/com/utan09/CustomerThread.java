package com.utan09;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class CustomerThread extends Thread{
    private Product p;

    public CustomerThread(Product p){
        this.p = p;
    }

    @Override
    public void run() {
        for(int i = 0; i <= 10; i++){
            p.getProduct();
        }
    }
}
