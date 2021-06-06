package com.utan;

import java.io.*;
import java.util.Scanner;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 * 转换流:InputStreamReader(字节转字符流)
 */
public class TestInputStreamReader {
    //main方法，程序入口
    public static void main(String[] args) throws IOException {
        File file = new File("D:"+ File.separator+"IO2"+File.separator+"IO.txt");
        File file2 = new File("D:"+ File.separator+"IO2"+File.separator+"IO8.txt");

        InputStream is = new FileInputStream(file);//字节流
        FileOutputStream fos = new FileOutputStream(file2);//字符流

        InputStreamReader isr = new InputStreamReader(is,"utf-8");//字节转字符流
        OutputStreamWriter osw = new OutputStreamWriter(fos,"GBK");//字符转字节流

        char[] chars = new char[1024];
        int len = isr.read(chars);
        while (len != -1){
            osw.write(chars,0,len);
            len = isr.read(chars);
        }
        osw.close();
        isr.close();



        //System类对io的支持
        InputStream is1 = System.in;//默认从键盘输入,得到一个输入流
        int n = is1.read();//阻塞,直到键盘录入回车程序继续进行
        System.out.println(n);

        //Scanner扫描从管出来的东西,System.in管,这个管怼到键盘上
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(i);


        //扫描文件
        Scanner scanner2 = new Scanner(new File("D:"+ File.separator+"IO2"+File.separator+"IO.txt"));
        while (scanner2.hasNext()){
            System.out.print(scanner2.next());
        }

        //输出流，打印流
        PrintStream printStream = System.out;//写到了控制台
        printStream.println(1);
    }
}
