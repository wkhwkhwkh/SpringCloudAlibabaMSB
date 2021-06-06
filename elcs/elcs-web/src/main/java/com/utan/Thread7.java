package com.utan;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class Thread7 extends Thread{

    public Thread7(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            System.out.println(this.getName()+"====="+i);
        }
    }
}

class TestThread7{
    //main方法，程序入口
    public static void main(String[] args) throws Exception {
        /*Thread7 thread7 = new Thread7("子线程");
        thread7.setDaemon(true);//在start之前调用
        thread7.start();
        for(int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName()+"======"+i);
        }*/
        Class c = Student.class;
        Constructor[] constructors = c.getConstructors();
        System.out.println(constructors.length);
        c.getDeclaredConstructors();
        Constructor constructor = c.getConstructor(String.class,int.class,char.class,String.class);
        System.out.println(constructor);
        c.getDeclaredConstructor();
        Student s = (Student) constructor.newInstance("wengkehao",12,'S',"jj");
        System.out.println(s);
        c.getFields();
        //System.out.println(c.getField("sno"));
        c.getDeclaredFields();
        Field f = c.getDeclaredField("sno");
        System.out.println(f.getName());
        System.out.println(f.getType().getName());
        System.out.println(Modifier.toString(f.getModifiers()));
        Field[] fields = c.getDeclaredFields();
        System.out.println(fields.length);
        Object o = c.getDeclaredConstructor().newInstance();
        f.set(o,"12");
        System.out.println(o);
        c.getMethods();
        c.getDeclaredMethods();
    }
}
