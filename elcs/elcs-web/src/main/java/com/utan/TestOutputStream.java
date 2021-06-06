package com.utan;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class TestOutputStream {
    //main方法，程序入口
    public static void main(String[] args) throws Exception{
        File file = new File("D:\\IO2\\IO3.txt");
        FileOutputStream fom = new FileOutputStream(file,true);
        String str = "你好IO";
        byte [] bytes = str.getBytes();
        for(int i =0; i < str.length(); i++){
            System.out.println(bytes);
            for(byte b : bytes){
                System.out.println(b);
            }
            fom.write(bytes);
        }
        fom.close();
    }
}
