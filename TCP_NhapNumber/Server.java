import java.io.*;
import java.net.*;
public class Server {
	public static void main(String[] args) throws IOException {
		// tao 1 server
		ServerSocket ss= new  ServerSocket(444);
		System.out.println("Server Runing.........");
		 while(true) {
			 ///client duoc ket noi
			 Socket s=ss.accept();
			 {System.out.println("Client da ket noi");}
			 ///khai bao stream in-out
			 InputStream is=s.getInputStream();
			 OutputStream Os=s.getOutputStream();
			 /// nhan tu client 
			 while(true) {
				 int ch=is.read();
				 if(ch == '@') break;
				 ///xuly va tra ve
				 String kqua="";
				 switch(ch) {
				 case'0':kqua= "Khong"; break;
				 case'1':kqua= "Mot"; break;
				 case'2':kqua= "Hai"; break;
				 case'3':kqua= "Ba"; break;
				 case'4':kqua= "Bon"; break;
				 case'5':kqua= "Nam"; break;
				 case'6':kqua= "Sau"; break;
				 case'7':kqua= "Bay"; break;
				 case'8':kqua= "Tam"; break;
				 case'9':kqua= "Chin"; break;
				 default : kqua="Khong phai so nguyen";
				 }
				 ///gui ve Client 
				 Os.write(kqua.getBytes());
			 }
			 System.out.println("Dong ket noi voi Client");
			 s.close();
		 }
	}
}
