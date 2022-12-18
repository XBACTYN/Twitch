package com.company.SClient;
//
//import org.opencv.core.Core;
//import org.opencv.core.Mat;
//import org.opencv.core.MatOfByte;
//import org.opencv.imgcodecs.Imgcodecs;
//import org.opencv.videoio.VideoCapture;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
//    static {
//        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
//        System.out.println(Core.VERSION);
//    }
    public static void main (String []args) throws IOException {
        System.out.println("Client");
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
//        byte[] imageData;
//        //Инициализация изображения в формате java
//        ImageIcon ic;
//
//        String serverIP="";
//        int port=1234;
//        Socket socket = new Socket(serverIP,port);
//
//        while(socket.isConnected()) {
//            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
//
//            int length = dataInputStream.readInt();
//
//            if (length > 0) {
//                imageData = new byte[length];
//                dataInputStream.readFully(imageData, 0, length);
//
//                ic = new ImageIcon(imageData);
//
//                //Помещаем изображение в контейнер
//                screen.setIcon(ic);
//                //привязываем изображение к окну
//                window.setContentPane(screen);
//                window.pack();
//            }
//        }
//
//        //Создаем события закрытия.
//        window.dispatchEvent(new WindowEvent(window,WindowEvent.WINDOW_CLOSING));
     }
}
