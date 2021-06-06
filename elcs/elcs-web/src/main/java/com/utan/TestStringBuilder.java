package com.utan;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class TestStringBuilder {
    //main方法，程序入口
    public static void main(String[] args) {
        StringBuilder sb3 = new StringBuilder();//初始化16长度的数组
        StringBuilder sb2 = new StringBuilder(3);//初始化3长度的数组
        StringBuilder sb = new StringBuilder("abc");
        sb = sb.append("def");
        System.out.println(sb.toString());
    }
}
