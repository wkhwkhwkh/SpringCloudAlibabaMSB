package com.utan11;

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
            if(i % 2 == 0){
                p.setProduct("费列罗","巧克力");
            }else{
                p.setProduct("哈尔滨","啤酒");
            }
        }
    }
}
