package com.utan;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class TestCopyFile {
    //main方法，程序入口
    public static void main(String[] args) throws Exception{
        File file = new File("D:"+ File.separator+"IO2"+File.separator+"IO.txt");
        File file2 = new File("D:"+ File.separator+"IO2"+File.separator+"IO4.txt");
        char [] chars = new char[5];
        FileReader fr = new FileReader(file);
        FileWriter fw = new FileWriter(file2);
        int len = fr.read(chars);
        while (len != -1){
            System.out.println(new String(chars,0,len));
            fw.write(chars);
            len = fr.read(chars,0,len);
        }
        fw.close();
        fr.close();
    }
}
