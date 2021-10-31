package com.com.tfb;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        Socket socket = null;
        OutputStream outputStream = null;
        DataOutputStream dos = null;
        InputStream inputStream = null;
        DataInputStream dis = null;
        try {
            socket = new Socket("192.168.1.2",8888);
            outputStream = socket.getOutputStream();
            dos = new DataOutputStream(outputStream);
            dos.writeUTF("你好!");

            inputStream = socket.getInputStream();
            dis = new DataInputStream(inputStream);
            String s = dis.readUTF();
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                if(dis!=null){
                    dis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(dos!=null){
                    dos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(socket!=null){
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
