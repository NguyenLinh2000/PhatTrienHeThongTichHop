import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;
import java.net.*;
import java.io.*;

public class Client {
        private static final int PORT =37;
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            InetAddress serverAddress= InetAddress.getByName("127.0.0.1"); // dia chi may nhan
            Scanner scn = new Scanner(System.in);
            while (true) {
                // gửi dl qua server
                System.out.println("nhap yeu cau:");
                String request = scn.nextLine();

                byte[] outputByte =request.getBytes();
                DatagramPacket outPacket = new DatagramPacket(outputByte, outputByte.length, serverAddress, PORT);
                socket.send(outPacket);
                /// nhận từ server
                byte[] inputByte = new byte[6000];
                /// 2 đối số 
                DatagramPacket inputpack = new DatagramPacket(inputByte, inputByte.length);
                socket.receive(inputpack);

                ///3 đối số: mảng byte 
                String inputStr = new String(inputpack.getData(),0,inputpack.getLength());
                System.out.println("ngay gio la :" + inputStr);

            }
        } catch (Exception e) {
            System.out.println(" err client" +e.toString());
        }
       
    }
}