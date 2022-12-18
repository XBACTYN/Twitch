package com.company.SClient;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {

    public static void main (String []args) throws IOException {
        System.out.println("Client");
        JFrame window = new JFrame();
        //Контейнер для изображения
        JLabel screen = new JLabel();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);


        byte[] imageData;
        //Инициализация изображения в формате java
        ImageIcon ic;

        String serverIP="25.57.172.199";
        int port=4321;
        Socket socket = new Socket(serverIP,port);

        while(socket.isConnected()) {
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

            int length = dataInputStream.readInt();

            if (length > 0) {
                imageData = new byte[length];
                dataInputStream.readFully(imageData, 0, length);

                ic = new ImageIcon(imageData);

                //Помещаем изображение в контейнер
                screen.setIcon(ic);
                //привязываем изображение к окну
                window.setContentPane(screen);
                window.pack();
            }
        }

        //Создаем события закрытия.
        window.dispatchEvent(new WindowEvent(window,WindowEvent.WINDOW_CLOSING));
     }
}
