package com.utan;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 * 多线程
 */
public class Callable1 implements Callable<Double> {

    @Override
    public Double call() throws Exception {
        return new Random().nextDouble();//返回随机数
    }
}

class TestCallable1{
    //main方法，程序入口
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable1 callable1 = new Callable1();
        FutureTask futureTask = new FutureTask(callable1);
        Thread thread = new Thread(futureTask);
        thread.start();
        //获取线程的返回值
        Object o = futureTask.get();
        System.out.println(o);
    }
}