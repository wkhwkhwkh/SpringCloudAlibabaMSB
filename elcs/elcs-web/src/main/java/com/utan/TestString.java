package com.utan;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 * String类
 */
public class TestString {
    //main方法，程序入口
    public static void main(String[] args) {
        String s1 = "翁克浩";
        System.out.println(s1);

        String s2 = new String("123fdsfdffdsf");
        String s3 = new String();
        String s4 = new String(new char[]{'2','3','4'});
        System.out.println(s2);
        System.out.println(s2.length());//字符串长度
        System.out.println(s2.isEmpty());//字符串是否为空
        System.out.println(s2.charAt(1));//获取字符串下标字符
        System.out.println(s2.equals(s3));//判断字符串值是否相等
        System.out.println(s2.substring(1));//截取字符串,从1开始
        System.out.println(s2 == s2.substring(0));

        System.out.println(s2.concat("3333"));//拼接字符串
        System.out.println(s2.replace('f','t'));//替换字符串
        System.out.println(Arrays.toString(s2.split("")));//分裂字符串为数组

        System.out.println("  a  v  d   ".trim());//去除前后空格

        System.out.println(String.valueOf("123"));//转成String



        String s5 = "a"+"b"+"c";
        String s6 = "ab"+"c";
        String s7 = "a"+"bc";
        String s8 = "a"+"bc"+"";

        String s9 = s8 + "fasdf";
    }
}
