package com.utan;
import java.util.Random;

import static java.lang.Math.*;
/**
 * @author: java1234_翁克浩
 * @version: 1.0
 *
 */
public class TestMath {
    //main方法，程序入口

    public static int random(){
        return 100;
    }

    public static void main(String[] args) {
        //常用方法
        System.out.println(Math.PI);
        double b = Math.random();//随机数[0，1) //底层调用的就是Random
        System.out.println(abs(-40));//绝对值
        System.out.println(ceil(9.9));//向上取整
        System.out.println(floor(9.9));//向下取整
        System.out.println(round(4.6));//四舍五入
        System.out.println(max(4,5));//取大
        System.out.println(min(4,5));//取小


        //静态导入
        //import static java.lang.Math.*;
        System.out.println(random()); //静态导入存在在一个问题,该类和Math类种方法一样时,优先使用该类

        //Random 产生随机数
        Random random = new Random(System.currentTimeMillis());//传入参数不同,产生随机数就不同
        int i = random.nextInt();
        System.out.println(i);


        Random random2 = new Random(100L);//传入参数相同,产生随机数就相同
        int j = random2.nextInt();
        System.out.println(j);


        Random random3 = new Random();
        int t = random3.nextInt(10);//产生[0,10)的int随机数
        System.out.println(t);

        double r = random3.nextDouble();//与Math.random()效果相同
        System.out.println(r);

        Byte a = 127;
        ++a;
        System.out.println(a);

        String str = new String("ad");


        StringBuilder sb = new StringBuilder("add");
    }
}