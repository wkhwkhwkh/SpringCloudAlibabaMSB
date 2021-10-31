package com.lambada;

/**
 * lambada表达式的基本使用
 */
public class TestLambada {
    public static void main(String[] args) {
        //无参数无返回值
        NoResultNoParameter noResultNoParameter = () -> {
            System.out.println(111);
        };
        noResultNoParameter.test();

        //有一个参数无返回值  参数列表中的数据类型可以省略,当参数列表只有一个参数时括号也可以省略
        NoResultSingleParameter noResultSingleParameter = a->{
            System.out.println(a);
        };
        noResultSingleParameter.test(1);

        //有多个参数无返回值 方法体只有一句代码时大括号可以省略
        NoResultMorePatameter noResultMorePatameter = (a,b) -> System.out.println(a+b);

        noResultMorePatameter.test(1,2);

        //无参数有返回值
        HasResultNoParameter hasResultNoParameter = ()->{
            System.out.println(111);
            return 1;
        };
        int result = hasResultNoParameter.test();
        System.out.println(result);

        //有一个参数有返回值
        HasResultSingleParameter hasResultSingleParameter = (a)->{
            System.out.println(111);
            return 2;
        };
        int b = hasResultSingleParameter.test(2);
        System.out.println(b);

        //有多个参数有返回值  方法体只有一个return语句 大括号可以省略，return也需要省略
        HasResultMoreParameter hasResultMoreParameter = (c,d) -> c*d;
        int e = hasResultMoreParameter.test(3,4);
        System.out.println(e);
    }
}
