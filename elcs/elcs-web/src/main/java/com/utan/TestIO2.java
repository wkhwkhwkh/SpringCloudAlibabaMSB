package com.utan;

import java.io.*;
import java.util.Scanner;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 * 从键盘输入------>文件
 */
public class TestIO2 {
    //main方法，程序入口
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;//字节流
        InputStreamReader isr = new InputStreamReader(is);//字节流转成字符流
        BufferedReader br = new BufferedReader(isr);//缓冲流

        File file = new File("D:"+ File.separator+"IO2"+File.separator+"IO9.txt");
        if(file.exists()){
            file.createNewFile();
        }
        FileWriter fr = new FileWriter(file,true);
        String content = br.readLine();
        BufferedWriter bw = new BufferedWriter(fr);
        while (!"exit".equals(content)){
            bw.write(content);
            bw.newLine();
            content = br.readLine();
        }
        bw.close();
        br.close();
    }
}
