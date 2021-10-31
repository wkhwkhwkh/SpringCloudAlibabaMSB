package com.utan;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class TestArrayList {
    //main方法，程序入口
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");//像cc后面添加一个"ff"
        list.add("dd");
        list.add("ee");

        ListIterator it = list.listIterator();
        it.hasPrevious();//是否有上一个元素
        while (it.hasNext()){
            if("cc".equals(it.next()))
                it.add("tt");
        }
        System.out.println(list);

        List list1 = new ArrayList();
        list1.add(1);


        int a = Integer.MAX_VALUE-11111111;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(a);
        int v =  a + (a>>1);
        System.out.println(v);

        int b = Integer.MAX_VALUE + 2;
        System.out.println(b);

        int c = 2147483647+1;
        System.out.println(c);

        //char d = 65535+1;
        System.out.println((int)Character.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
    }
}
