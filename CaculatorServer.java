import java.net.ServerSocket;

import java.net.*;
import java.io.*;

public class CaculatorServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9903);
            System.out.println("Server Running...");
            while(true){
                Socket socket = serverSocket.accept();
                System.out.println("welcome socket "+socket.getPort());
                CaculatorThread serviceProcess =new CaculatorThread(socket);
                serviceProcess.start();
            }
        } catch (IOException ex) {
            System.out.println("loi server" +ex.toString());
        }
    }
}