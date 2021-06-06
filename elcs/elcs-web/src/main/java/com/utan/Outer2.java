package com.utan;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 * 局部内部类
 */
public class Outer2 {

    public void method(){
        final int num = 10;
        class A{
            public void f(){
                //num = 20;   局部内部类访问到的变量必须是被final修饰
                System.out.println(10);
            }
        }
    }


    //如果类B在整个项目中只使用一次,那么就没有必要单独创建一个类,使用内部类就可以了
    public Comparable method2(){
        class B implements Comparable{
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
            return new B();
    }


    public Comparable method3(){
        //匿名内部类
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }

    public void method4(){
        Comparable comparable = new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };

        System.out.println(comparable.compareTo("asd"));
    }
}
