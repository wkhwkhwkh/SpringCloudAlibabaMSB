package com.utan;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class TestMap {
    //main方法，程序入口
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        System.out.println(map.put(1,"lili"));

        try {
            System.out.println(1111);
            System.out.println(1/0);
            System.out.println(222);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println(3);
    }
}
