package com.utan11;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class Test {
    //main方法，程序入口
    public static void main(String[] args) {
        Product p = new Product();
        ProducerThread producerThread = new ProducerThread(p);
        CustomerThread customerThread = new CustomerThread(p);
        producerThread.start();
        customerThread.start();
    }
}
