package com.company.SServer;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {


    public static void main (String []args) throws IOException {
        System.out.println("Server");

        String address = "25.57.172.199";
        int repeaterPort = 1234;
        int clientPort = 4321;

        InetAddress ServerIP =  InetAddress.getByName(address);;
        ServerSocket repeaterSocket = new ServerSocket(repeaterPort,1,ServerIP);
        ServerSocket clientSocket = new ServerSocket(clientPort,5,ServerIP);
        while(true)
        {
            try{
                //Сокет клиента
                //Socket socket = serverSocket.accept();
                Socket repeater = repeaterSocket.accept();
                Socket client = clientSocket.accept();

                DataInputStream dataInputStream = new DataInputStream(repeater.getInputStream());
                DataOutputStream dataOutputStream = new DataOutputStream(client.getOutputStream());
                while(repeater.isConnected())
                {
                    //размер пакета
                    int length = dataInputStream.readInt();

                    if(length >0){
                        byte [] imageData = new byte[length];
                        dataInputStream.readFully(imageData,0,length);

                        //Здесь должны быть все клиенты
                        dataOutputStream.writeInt(length);
                        dataOutputStream.write(imageData);
                    }
                }
                client.close();
                repeater.close();
            }
            catch (Exception e){
                e.printStackTrace();
        }
        }
    }

}
