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
    }
}
