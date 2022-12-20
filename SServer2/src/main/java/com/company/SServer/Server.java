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

        String address = args[0];
        //System.out.println(args[0]+" "+args[1]);
        //String serverIP="25.57.172.199";
        //String serverIP= args[0]
        int repeaterPort = 1234;
        int clientPort = 4321;

        InetAddress ServerIP =  InetAddress.getByName(address);;
        ServerSocket repeaterSocket = new ServerSocket(repeaterPort,1,ServerIP);
        ServerSocket clientSocket = new ServerSocket(clientPort,1,ServerIP);
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
                    try {
                        if (client.isConnected()) {
                            System.out.println("Идет передача");
                            //размер пакета
                            int length = dataInputStream.readInt();

                            if (length > 0) {
                                byte[] imageData = new byte[length];
                                dataInputStream.readFully(imageData, 0, length);

                                //Здесь должны быть все клиенты
                                dataOutputStream.writeInt(length);
                                dataOutputStream.write(imageData);
                            }

                        } else {
                            client.close();
                            System.out.println("Else");
                            client = clientSocket.accept();
                        }
                    }
                    catch (Exception e){
                        client.close();
                        System.out.println("Catch");
                        client = clientSocket.accept();
                        dataOutputStream = new DataOutputStream(client.getOutputStream());
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
