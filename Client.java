

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
    private static Scanner nhapvao;
    public static void main(String[] args) {
        try {
            Registry reg = LocateRegistry.getRegistry("localhost", 6789);

            HelloInterface obj = (HelloInterface) reg.lookup("HelloObj");

            System.out.println(obj.printHello());
            nhapvao=new Scanner(System.in);
          
            System.out.print("Nhap vao chuoi: ");
            String ten;
            ten=nhapvao.nextLine();

            System.out.println("\t---------------------Menu-------------------------");
            
            System.out.println("1.dem so luong tu \n2.xuat chuoi nguoc \n3.thoat \n");
            
            while (true) {
                System.out.print("chon  = ");
                int chon;
                
                chon=nhapvao.nextInt();

                switch (chon) {
                    case 1:             
                            System.out.print("so luong tu trong chuoi la: ");                           
                            System.out.println(obj.countWords(ten));                           
                            System.out.println("\n");              
                        break;
                        case 2:
                             StringBuilder str = new StringBuilder(ten);
                             System.out.print("chuoi duoc dao nguoc la:   ");
                             System.out.println(str.reverse().toString());
                             System.out.println("\n");                       
                        break;
                        case 3:
                        System.exit(1);
                        break;
                    default:
                    System.out.println("nhap sai");
                        break;
                }
                
            }         
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
}
