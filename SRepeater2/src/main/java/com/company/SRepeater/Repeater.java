package com.company.SRepeater;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import com.github.sarxos.webcam.Webcam;
import java.awt.Dimension;
import java.sql.SQLOutput;


public class Repeater {

    public static void main (String []args) throws IOException {
        System.out.println("hello");
        JFrame window = new JFrame();
        //Контейнер для изображения
        JLabel screen = new JLabel();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        byte[] imageData;
//        //Инициализация изображения в формате java
        ImageIcon ic;
        Webcam webcam = Webcam.getDefault();
        webcam.setViewSize(new Dimension(640, 480));
        webcam.open();

        System.out.println(args[0]+" "+args[1]);
        //String serverIP="25.57.172.199";
        String serverIP= args[0];
        int port = Integer.parseInt(args[1]);
        //int port=1234;

            Socket socket = new Socket(serverIP, port);
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            while (webcam.isOpen()) {
                try {
                    BufferedImage frame = webcam.getImage();

                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    ImageIO.write(frame, "jpg", baos);
                    imageData = baos.toByteArray();

                    int length = imageData.length;

                    dataOutputStream.writeInt(length);
                    dataOutputStream.write(imageData);

                    ic = new ImageIcon(imageData);

                    //Помещаем изображение в контейнер
                    screen.setIcon(ic);
                    //привязываем изображение к окну
                    window.setContentPane(screen);
                    window.pack();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            socket.close();
            webcam.close();
            //Создаем события закрытия.
            window.dispatchEvent(new WindowEvent(window, WindowEvent.WINDOW_CLOSING));

    }
}
