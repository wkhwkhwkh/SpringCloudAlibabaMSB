package com.utan;

import java.io.*;

/**
 * @author: java1234_翁克浩
 * @version: 1.0
 * 对象流(序列化和反序列化)
 */
public class TestObjectIO {
    //main方法，程序入口
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //将对象写入文件  该对象必须实现Serializable接口
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("D:"+ File.separator+"IO2"+File.separator+"IO10.txt")));
        oos.writeObject(new Student("201540920137"));
        oos.close();

        //将对象从文件读出来
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("D:"+ File.separator+"IO2"+File.separator+"IO10.txt")));
        Student student = (Student) ois.readObject();
        System.out.println(student);
        ois.close();
    }
}
