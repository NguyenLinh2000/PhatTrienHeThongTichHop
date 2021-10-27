import java.net.*;
import java.io.*;
import java.util.Scanner;
public class  CaculatorClient{
    public static void main(String[] args) {
        try {
        Socket socket = new Socket("127.0.0.1",9903);
        InputStream is= socket.getInputStream();
        OutputStream os = socket.getOutputStream();
        Scanner keyboardScanner = new Scanner(System.in);
        Scanner inputScanner = new Scanner(is);
         PrintWriter outputPrint = new PrintWriter(os);

         while(true){
             System.out.println("Nhap phep toan: ");
             String request=keyboardScanner.nextLine();
             String newRequest =ChuyenYeuCau(request);
            
            ///gui ket qu
            outputPrint.println(newRequest);
            outputPrint.flush();
            //nhan ket qua

            String result = inputScanner.nextLine();
            System.out.println("Ket qua"+result);
         }
         socket.close();
        } catch (IOException ex) {
            System.out.println("loi client: " + ex.toString());
        }
         
    }
    public static String ChuyenYeuCau(String request){
        request = request.trim();
        String result= " ";
        int firstSpace = request.indexOf(" ");
        int secondSpace = request.lastIndexOf(" ");

        if(firstSpace > 0){
            String op = request.substring(firstSpace+1,secondSpace);
            String operant1=request.substring(0,firstSpace);
            String operant2=request.substring(secondSpace+1);
            request=op+" "+operant1+" "+operant2;
        }else{
            result = request ;
        }
        return result;
    }
}
