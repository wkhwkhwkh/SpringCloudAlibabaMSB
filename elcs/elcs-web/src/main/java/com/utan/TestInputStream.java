package com.utan;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class TestInputStream {
    //main方法，程序入口
    public static void main(String[] args) throws Exception{
        File file = new File("D:\\IO2\\IO.txt");
        FileInputStream fim = new FileInputStream(file);
        /*int n = fim.read();//一个一个字节读  返回一个一个字节
        int count = 0;
        while (n != -1){
            count++;
            System.out.println(n);
            n = fim.read();
        }
        System.out.println(count);*/
        byte[] bytes = new byte[8];
        int len = fim.read(bytes);
        while (len != -1){
            //System.out.println(Arrays.toString(bytes));//错误  最后一次byte数组里面包括上一次没覆盖的字符
            System.out.println(new String(bytes,0,len));
            len = fim.read(bytes);
        }
        fim.close();
    }
}
