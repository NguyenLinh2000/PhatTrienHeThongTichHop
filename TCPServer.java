import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer{
    public static void main(String[] args) {
       try {
           try (ServerSocket server = new ServerSocket(7979)) {
        	   
			System.out.println("Server Runing... ");

			   while(true){
			       Socket s = server.accept();
			       if(s.isConnected()) {System.out.println(" Client Da ket noi");}
			     //nhap du lieu
					BufferedReader read = new BufferedReader(new  InputStreamReader(s.getInputStream()));
					//xuat ra
					BufferedWriter write = new BufferedWriter(new  OutputStreamWriter(s.getOutputStream()));
			
			
					String chuoi = read.readLine();
					System.out.println("Client đã nhap: "+ chuoi);
					chuoi = chuoi.toUpperCase();
					
					System.out.println("Chuoi duoc xu ly va tra ve Client : "+ chuoi);
			      	write.write(chuoi);  //dua chuoi nay len socket
				    write.newLine();
				    write.flush(); // xóa bộ nhớ đệm 
			
			    // server.close();
			   }
		}
       } catch (Exception e) {
       }
        
    }
}
