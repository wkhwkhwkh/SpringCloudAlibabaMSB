package com.utan;

import java.util.Objects;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class Person {

    private String name;//子类可以继承父类的私有属性，只是因为封装阻碍了调用，
                        // 但是提供了间接调用的方法
    private int age;
    private char sex;

    public Person(){

    }


    public Person(String name){
        this.name = name;
    }

    public Person(String name,int age,char sex){
        this(name);
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }

    /**
     * play方法
     * @param a a变量
     * @param b b变量
     * @return 返回a+b
     * @exception RuntimeException 运行时异常
     * @exception IndexOutOfBoundsException 越界异常
     * @see Student
     */
    public int  play(int a, int b){
        if(a > 0){
            throw new RuntimeException("a");
        }else if(a == 0){
            throw new IndexOutOfBoundsException("越界");
        }
        Student s = new Student();
        return a+b;
    }
}
