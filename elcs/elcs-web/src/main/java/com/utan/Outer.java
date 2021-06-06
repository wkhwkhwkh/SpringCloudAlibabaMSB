package com.utan;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 *
 * 类的组成:属性,方法,代码块(普通块,构造块,静态代码块,同步块),构造器
 * 内部类:成员内部类,局部内部类(方法内,代码块内,构造器内)  A,B,C:局部内部类 D:成员内部类
 * 成员内部类:private public protected default final abstract(与final只能有一个)
 */
public class Outer {
    private int age = 10;

    public Outer() {
        class C{

        }
    }

    /**
     * 成员内部类
     */
    class D{
        int age = 20;
        String name;
        public void method(){
            int age = 30;
            //System.out.println(age); 内部类可以访问外部类的属性和方法
            //a();
            System.out.println(age); //30
            System.out.println(this.age); //20
            System.out.println(Outer.this.age);//10
        }
    }

    /**
     * 静态册成员内部类
     */
    static class E{
        public void method(){
            /*System.out.println(age);  静态内部类只能访问外部类的static修饰的内容
            a();*/
        }
    }

    public Outer(int age) {
        this.age = age;
    }


    public void a(){
        System.out.println("这是a方法!");
        {
            System.out.println("这是一个普通块!");
            class B{

            }
        }

        class A{

        }

        D d = new D();
        System.out.println(d.name);  //外部类想要访问内部类的东西需要创建内部类对象,然后进行调用
        d.method();
    }

    static{
        System.out.println("这是静态代码块");
    }

    {
        System.out.println("这是构造块!");
    }


    //main方法，程序入口
    public static void main(String[] args) {
        Outer out = new Outer();
        out.a();


        //创建内部类对象(静态内部类对象)
        Outer.E e = new Outer.E();


        //创建内部类对象(非静态内部类对象)
        Outer.D d = out.new D();
    }
}
