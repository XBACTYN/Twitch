package com.company.SRepeater;

//import org.opencv.core.Core;
//import org.opencv.core.Mat;
//import org.opencv.core.MatOfByte;
//import org.opencv.imgcodecs.Imgcodecs;
//import org.opencv.videoio.VideoCapture;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Repeater {
    static {
        //nu.pattern.OpenCV.loadLibrary();
        //System.loadLibrary(org.opencv.core.Core.NATIVE_LIBRARY_NAME);
        //System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        //System.out.println(Core.VERSION);
    }
    public static void main (String []args) throws IOException {
        System.out.println("hello");
//        JFrame window = new JFrame();
//        //Контейнер для изображения
//        JLabel screen = new JLabel();
//        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        window.setVisible(true);
//
//        //Источник 0 - вебкамера
//        VideoCapture cap = new VideoCapture(0);
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
//
//            Socket socket = new Socket(serverIP, port);
//            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
//
//            while (cap.grab()) {
//                try {
//                    cap.read(frame);
//
//                    Imgcodecs.imencode(".png", frame, buf);
//                    imageData = buf.toArray();
//
//                    int length = imageData.length;
//
//                    dataOutputStream.writeInt(length);
//                    dataOutputStream.write(imageData);
//
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//            socket.close();
//            cap.release();
//            //Создаем события закрытия.
//            window.dispatchEvent(new WindowEvent(window, WindowEvent.WINDOW_CLOSING));

    }
}
