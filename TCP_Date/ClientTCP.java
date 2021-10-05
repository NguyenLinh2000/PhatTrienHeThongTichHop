package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientTCP {
	public static void main(String[] args) {
		try {
			
			System.out.println("day la client");
			try (Socket s = new Socket("localhost",3456)) {
				//nhap du lieu
				BufferedReader read = new BufferedReader(new  InputStreamReader(s.getInputStream()));
				
				//xuat ra
				BufferedWriter write = new BufferedWriter(new  OutputStreamWriter(s.getOutputStream()));
				//nhap tu bang phim 

				Scanner sc = new Scanner(System.in);
				System.out.println("nhap chuoi can gui toi server");
				String chuoi = sc .nextLine();
				/// dua chuoi len 
				write.write(chuoi);
				write.newLine();
				write.flush(); //xóa bộ nhớ đệm
				
				
				chuoi=read.readLine();
				System.out.println("chuoi sau khi server xu ly la :" + chuoi);
			}
			
			System.out.println("");
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
   
}
