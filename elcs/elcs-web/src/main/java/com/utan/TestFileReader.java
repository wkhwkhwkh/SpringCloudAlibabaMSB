package com.utan;

import java.io.File;
import java.io.FileReader;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class TestFileReader {

    //main方法，程序入口
    public static void main(String[] args) throws Exception{
        File file = new File("D:"+ File.separator+"IO2"+File.separator+"IO.txt");
        FileReader fr = new FileReader(file);
        int n = fr.read();//一个字符一个字符读,返回的是字符
        int count = 0;
        while (n!=-1){
            count++;
            System.out.println(n);
            n = fr.read();
        }
        System.out.println(count);
        /*char [] ch = new char[5];
        int len = fr.read(ch);//返回有效的字符长度  批量读
        while (len!=-1){
            System.out.println(new String(ch,0,len));
            System.out.println(ch);//错误  最后一次char数组里面包括上一次没覆盖的字符
            len = fr.read(ch);
        }*/
        fr.close();
    }
}
