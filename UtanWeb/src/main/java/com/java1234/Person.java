package com.java1234;

import com.utan.User;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author java1234_翁克浩
 * @version 1.0     1
 */
public class Person implements Serializable {

    private static final long serialVersionUID = -2376109024620239935L;

    public static void main(String[] args){

        for(int i = 0; i <= 100; i++){
            System.out.println(i);
        }
        System.out.println(new User());
        int age = 10 + 2;
        System.out.println(age);
        float a = 0.11F;
        double b = a;
        double c = 0.1;
        System.out.println(a==b);
        System.out.println(a==c);

        byte d = 10;
        int e = 12;
        d+=e;//底层自动强转   d=d+e;不会强转，编译会报错

        Scanner sc = new Scanner(System.in);
        //sc.hasNextInt();//判断键盘输入是否为int型

        int sum = 0;
        for(int i = 1; i <= 5; i++){
            sum += i;
        }
        /**sum = 0;
        int i = 1;
        while(i <= 5){
            sum += i;
            i++;
        }
        System.out.println(sum);*/

        sum = 0;
        int i = 0;
        do{
            i++;
            sum += i;
        }while(i < 5);
        System.out.println(sum);

        int [] arr = {1} ;






        int[][] arr2 = new int[3][2];
        arr2[1] = new int[]{1,2,3,4};
        for(int [] t: arr2){
            for(int r : t){
                System.out.print(r+"\t");
            }
            System.out.println();
        }


        int [] u = new int[5];
            u = new int[]{1,2,3,4,5,6};
        System.out.println(Arrays.toString(u));


    }
}
