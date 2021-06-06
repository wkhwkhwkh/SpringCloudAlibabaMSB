package com.utan;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class TestInteger {

    //main方法，程序入口
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.MAX_VALUE+1);//物极必反  最大值+1成了最小值
        System.out.println(Integer.MIN_VALUE-1);//物极必反  最小值-1成了最大值

        Integer integer = new Integer(12);
        System.out.println(integer);

        Integer integer2 = new Integer("12");
        System.out.println(integer2);


        Integer integer3 = 12;//自动装箱  底层通过Interger.valueOf()实现
        System.out.println(integer3);

        int i = new Integer(13);//自动拆箱  底层通过Interger.intValue()实现
        System.out.println(i);


        Integer integer4 = new Integer(15);
        Integer integer5 = new Integer(15);
        System.out.println(integer4.compareTo(integer5));
        System.out.println(integer4.equals(integer5));//底层重写了,比较值
        System.out.println(integer4==integer5);


        Integer integer6 = new Integer(12);
        Integer integer7 = new Integer(12);
        System.out.println(integer6 == integer7);

        Integer integer8 = 12;
        Integer integer9 = 12;
        System.out.println(integer8 == integer9);


        Integer integer10 = 133;  //如果自动装箱值在-128--127之间 比较的是具体的值,否则比较地址
        Integer integer11 = 133;
        System.out.println(integer10 == integer11);

        Integer integer12 = 13;  //如果自动装箱值在-128--127之间 比较的是具体的值,否则比较地址
        Integer integer13 = 13;
        System.out.println(integer12 == integer13);


        int b = Integer.parseInt("123");//String转int

        String str = Integer.toString(21);
        System.out.println(str);

        Double c = 123.2;
        Double d = 123.2;
        System.out.println(c.equals(d));
        System.out.println(c==d);
    }
}
