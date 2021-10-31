package com.lambada;

/**
 * lambada中方法的引用
 */
public class TestInterfaceChange {

    //该方法的参数列表必须和接口的参数列表一样
    public static void function(){
        System.out.println(11111);
    }

    public static void main(String[] args) {
        //当多个实现类同时实现一个接口时，把方法体抽取成一个方法
        ChangeInterface changeInterface = () -> System.out.println(11111);
        changeInterface.change();

        ChangeInterface changeInterface2 = () -> System.out.println(11111);
        changeInterface2.change();


        ChangeInterface changeInterface3 = TestInterfaceChange::function;

        ChangeInterface2 changeInterface4 = System.out::println;

        changeInterface4.change("aaaaa");

    }
}
