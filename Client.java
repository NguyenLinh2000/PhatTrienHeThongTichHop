
import java.io.*;
import java.net.*;
public class Client {
public static void main(String[] args) throws UnknownHostException, IOException {
	///tao ket noi
	Socket s=new Socket("127.0.0.1",444);
	System.out.println("Client da duoc ket noi ");
	//khai bao stream in-out
	InputStream is=s.getInputStream();
	 OutputStream Os=s.getOutputStream();
	 /// nhap ki tu 
	 while(true) {
		 ///nhap tu bang phim 
		 System.out.println("Client nhap vao Numer: ");
		 int ch=System.in.read();
		 System.in.skip(2); //bo qua 2 ki tu tiep theo
		//  ///gui sang Server
		 Os.write(ch);
		 if(ch=='@') break;
		 /// nhan ket qua tu Server
		 byte b[]=new byte[100];
		 int n = is.read(b);
		 String kqua= new String(b,0,n);
		 System.out.println("Server tra ve ket qua: "+kqua);
	 }
	 //dong ket noi
	 s.close();
}
}
