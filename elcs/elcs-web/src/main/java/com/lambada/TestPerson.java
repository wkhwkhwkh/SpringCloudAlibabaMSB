package com.lambada;

public class TestPerson {
    public static void main(String[] args) {
        PersonCreate personCreate = () -> new Person();
        personCreate.getPerson();

        PersonCreate personCreate2 = Person::new;//使用new,无参构造方法的引用
        personCreate2.getPerson();

        PersonCreate2 personCreate3 = Person::new;//根据接口的参数调用不同的构造
        personCreate3.getPerson("a",12);

    }
}

interface  PersonCreate{
    Person getPerson();
}

interface  PersonCreate2{
    Person getPerson(String name,int age);
}