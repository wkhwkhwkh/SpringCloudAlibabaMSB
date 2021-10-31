package com.lambada;


public class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("无参构造执行了!");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("有参构造执行了!");
    }
}
