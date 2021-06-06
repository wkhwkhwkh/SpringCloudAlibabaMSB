package com.utan;

import java.io.File;
import java.io.FileWriter;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 */
public class TestFileWrite {
    //main方法，程序入口
    public static void main(String[] args) throws Exception{
        String str = "wengkehao翁克浩";
        FileWriter fw = new FileWriter(new File("D:" + File.separator + "IO2" + File.separator + "IO2.txt"),true);//true追加,false覆盖
        /*for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            fw.write(ch);//一个一个字符写
        }*/

        char[] chars = str.toCharArray();//将字符串转成char数组
        fw.write(chars);//批量写
        fw.close();
    }
}
