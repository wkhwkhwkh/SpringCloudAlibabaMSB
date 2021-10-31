package com.com.tfb;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket ss = null;
        Socket accept = null;
        InputStream inputStream = null;
        DataInputStream dis = null;
        OutputStream outputStream = null;
        DataOutputStream dos = null;
        try {
            ss = new ServerSocket(8888);
            accept = ss.accept();

            inputStream = accept.getInputStream();
            dis = new DataInputStream(inputStream);
            String s = dis.readUTF();
            System.out.println(s);


            outputStream = accept.getOutputStream();
            dos = new DataOutputStream(outputStream);
            dos.writeUTF("我已收到!");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(dos!=null){
                    dos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if(dis!=null){
                    dis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(accept!=null){
                    accept.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(ss!=null){
                    ss.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
