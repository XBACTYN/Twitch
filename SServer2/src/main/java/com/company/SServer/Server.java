package com.company.SServer;

//import org.opencv.core.Core;
//import org.opencv.core.Mat;
//import org.opencv.core.MatOfByte;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
//    static {System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
//        System.out.println(Core.VERSION);
//    }

    public static void main (String []args) throws IOException {
        System.out.println("Server");
//        JFrame window = new JFrame();
//        //Контейнер для изображения
//        JLabel screen = new JLabel();
//        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        window.setVisible(true);
//
//        //Изображение
//        Mat frame = new Mat();
//        //Матрица байтов
//        MatOfByte buf = new MatOfByte();
//        //Инициализация изображения в формате java
//        ImageIcon ic;
//
//        ServerSocket serverSocket = new ServerSocket(1234);
//        ServerSocket repeaterSocket = new ServerSocket(4321);
//        while(true)
//        {
//            try{
//                //Сокет клиента
//                //Socket socket = serverSocket.accept();
//                Socket repeater = repeaterSocket.accept();
//                Socket client = serverSocket.accept();
//
//                DataInputStream dataInputStream = new DataInputStream(repeater.getInputStream());
//                DataOutputStream dataOutputStream = new DataOutputStream(client.getOutputStream());
//                while(repeater.isConnected())
//                {
//                    //размер пакета
//                    int length = dataInputStream.readInt();
//
//                    if(length >0){
//                        byte [] imageData = new byte[length];
//                        dataInputStream.readFully(imageData,0,length);
//
//                        //Здесь должны быть все клиенты
//                        dataOutputStream.writeInt(length);
//                        dataOutputStream.write(imageData);
//                    }
//                }
//                client.close();
//                repeater.close();
//            }
//            catch (Exception e){
//                e.printStackTrace();
//        }
//        }
    }

}
