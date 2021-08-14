package com.utan;

import java.util.ArrayList;

import static java.lang.Math.*;
/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class Test {
    //main方法，程序入口
    public static void main(String[] args) {
        Student student = new Student("a",11,'M',"ss");
        Student student2 = new Student("a",11,'M',"ss");
        System.out.println(student == student2);
        student.compareTo(student2);
        System.out.println(student.equals(student2));
        student.a();
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getSex());
        System.out.println(student.getSno());


        System.out.println( random());

        @SuppressWarnings("unused") //未使用的变量
        int j;

        @SuppressWarnings({"unused","rwatype"}) //未使用     泛型
        ArrayList arrayList = new ArrayList();

        System.out.println(1111);
    }
}
