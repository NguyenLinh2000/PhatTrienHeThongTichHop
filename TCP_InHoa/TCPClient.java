import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient{
public static void main(String[] args) {
    System.out.println("Client da duoc tao ");
  try {
    Socket s = new Socket("127.0.0.1", 7979) ;
    //Nhap du lieu
    BufferedReader read = new BufferedReader(new  InputStreamReader(s.getInputStream()));
    //xuat du lieu
    BufferedWriter write = new BufferedWriter(new  OutputStreamWriter(s.getOutputStream()));
 
    System.out.println("Nhap chuoi");
    Scanner sc = new Scanner(System.in);
    String chuoi = sc .nextLine();
    write.write(chuoi);
	write.newLine();
	write.flush(); //xóa bộ nhớ đệm
 
	chuoi=read.readLine();
	System.out.println("chuoi sau khi server xu ly la :" + chuoi);

    
  } catch (Exception e) {
  }
}
    
}