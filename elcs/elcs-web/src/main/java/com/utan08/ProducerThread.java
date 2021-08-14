package com.utan08;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class ProducerThread extends Thread{
    private Product p;//共享的资源

    public ProducerThread(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        for(int i = 0; i <= 10; i++) {
            synchronized (Product.class) {
                if (i % 2 == 0) {
                    p.setBrand("费列罗");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    p.setName("巧克力");
                } else {
                    p.setBrand("哈尔滨");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    p.setName("啤酒");
                }
                System.out.println("生产者生产了" + p.getBrand() + "==========" + p.getName());
            }
        }
    }
}
