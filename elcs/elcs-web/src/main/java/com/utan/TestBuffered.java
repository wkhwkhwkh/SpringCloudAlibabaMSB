package com.utan;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 * 缓冲流
 */
public class TestBuffered {
    //main方法，程序入口
    public static void main(String[] args) throws IOException {
        File file = new File("E:"+ File.separator+"io.txt");
        //File file2 = new File("E:"+ File.separator+"IO2"+File.separator+"IO7.txt");

        /**
         * 字节缓冲流
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(file2);

        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        byte [] bytes = new byte[1024];
        int len = bis.read(bytes);
        while (len != -1){
            bos.write(bytes,0,len);
            len = bis.read(bytes);
        }
        bos.close();
        bis.close();
         */
        //字符缓冲流
        FileReader reader = new FileReader(file);
        //FileWriter writer = new FileWriter(file2);

        BufferedReader br = new BufferedReader(reader);
        //BufferedWriter bw = new BufferedWriter(writer);

        char [] chars = new char[1024];
        int len = br.read(chars);
        while(len!=-1){
           // bw.write(chars,0,len);
            len = br.read(chars);
        }
       // bw.close();
        br.close();
    }
}
