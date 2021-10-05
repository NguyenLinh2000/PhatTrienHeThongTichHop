import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;
import java.util.Scanner;
import java.net.*;
import java.io.*;
public class Server {
    private static final int PORT =37;
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(PORT);

            while (true) {
                // nhận dư lien tu client
                byte[] inputByte = new byte[1];
                DatagramPacket inputPack = new DatagramPacket(inputByte,0);
                socket.receive(inputPack);

                //xử lý 
                Date date = new Date();
                String outputStr = date.toString();

                // gui lại du lie cho client

                byte[] outputByte = outputStr.getBytes();
                DatagramPacket outputPack = new DatagramPacket(outputByte, outputByte.length,inputPack.getAddress(),inputPack.getPort());
                socket.send(outputPack);
            }

        } catch (Exception e) {
            System.out.println("err Server :"+ e.toString());
        }

        
    }
}