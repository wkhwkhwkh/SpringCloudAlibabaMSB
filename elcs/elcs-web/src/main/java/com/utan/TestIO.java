package com.utan;

import java.io.File;
import java.util.Arrays;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 * file可表示文件，目录
 */
public class TestIO {
    //main方法，程序入口
    public static void main(String[] args) throws Exception{
        File file = new File("D:\\test.txt");
        File file1  = new File("D:/test.txt");
        File file2 = new File("d:"+File.separator+"test.txt");//建议使用,根据操作系统的分隔符判断

        System.out.println("文件是否可读:"+file.canRead());
        System.out.println("文件是否可写:"+file.canWrite());
        System.out.println("文件名称:"+file.getName());
        System.out.println("上级目录:"+file.getParent());
        System.out.println("是否文件:"+file.isFile());
        System.out.println("是否目录:"+file.isDirectory());
        System.out.println("是否隐藏:"+file.isHidden());
        System.out.println("文件大小:"+ file.length());
        System.out.println("是否存在:"+file.exists());
        if(file.exists()){
            //file.delete();//文件删除
        }else{
            file.createNewFile();//创建文件
        }
        System.out.println(file == file2);
        System.out.println(file.equals(file2));

        //和路径相关
        System.out.println("绝对路径:"+file.getAbsolutePath());
        System.out.println("相对路径:"+file.getPath());
        System.out.println("toString:"+file.toString());

        File file3 = new File("demo.text");
        if(!file3.exists()){
            file3.createNewFile();
        }
        System.out.println("绝对路径:"+file3.getAbsolutePath());
        //相对D:\project\elcs位置
        System.out.println("相对路径:"+file3.getPath());
        System.out.println("toString:"+file3.toString());   //toString和相对路径保持一致


        File file4 = new File("D:\\IO");//目录
        file4.mkdir();

        File file5 = new File("D:\\IO2\\testIO");//创建多层
        file5.mkdirs();

        file4.delete();//删除文件

        file5.delete();//只会删除一层,前提是空目录,如果不是空目录就不会删除

        File file6 = new File("D:"+File.separator+"nexus");//文件夹下文件目录或文件对应名字的数组
        String[] files = file6.list();
        System.out.println(Arrays.toString(files));

        File[] files2 = file6.listFiles();
        for(File file7 : files2){
            System.out.println(file7.getName() +"======="+ file7.getAbsolutePath());
        }
    }
}
