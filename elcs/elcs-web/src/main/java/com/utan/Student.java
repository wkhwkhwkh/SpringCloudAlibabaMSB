package com.utan;

import java.io.Serializable;
import java.util.Comparator;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class Student extends Person implements Comparable, Serializable {
    private static final long serialVersionUID = -8840217897437016707L;
    private String sno;

    public Student(){
        super();
    }

    public Student(String name,int age,char sex,String sno){
        super(name,age,sex);
        this.sno = sno;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public Student(String sno) {
        this.sno = sno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno='" + sno + '\'' +
                '}';
    }

    public void a(){
        System.out.println(this.getName());  //this.name   name继承过来了，但是封装起来了，不能直接访问
        System.out.println(super.getName());
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    int a;
}
