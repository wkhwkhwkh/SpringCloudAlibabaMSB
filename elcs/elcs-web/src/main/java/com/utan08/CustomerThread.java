package com.utan08;

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
            synchronized (Product.class) {
                System.out.println("消费者消费了" + p.getBrand() + "=======" + p.getName());
            }
        }
    }
}
