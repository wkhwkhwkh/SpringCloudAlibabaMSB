package com.utan;

import sun.applet.Main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class TestCopyImg {
    //main方法，程序入口
    public static void main(String[] args) throws Exception{
        File file = new File("D:"+ File.separator+"IO2"+File.separator+"Welcome.html");
        File file2 = new File("D:"+ File.separator+"IO2"+File.separator+"Welcome2.html");
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(file2);
        byte[] bytes = new byte[1024*8];
        int len = fis.read(bytes);
        int count = 0;
        while (len != -1){
            count++;
            fos.write(bytes,0,len);
            len = fis.read();
        }
        System.out.println(count);
        fos.close();
        fis.close();
    }
}
