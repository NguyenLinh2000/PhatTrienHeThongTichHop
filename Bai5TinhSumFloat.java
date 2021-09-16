package Tuan2;

import java.util.Scanner;
 
public class Bai5TinhSumFloat{
    public static int nhap(){

                  Scanner input= new Scanner(System.in); 
                  boolean check= false;
                  int n=0; 
                  while(!check){
                         System.out.print(" "); 
                         try{
                               n= input.nextInt(); 
                               check= true;
                         }catch(Exception e){
                                System.out.println("nhap so! Nay nhap lai... "); 
                                System.out.print("n =  "); 
                                input.nextLine();
                         }
                  }
                  return (n);
      }
    public static int tinhTong(long i){ 
                  int sum=0;
                  long n; 
                  while(i!=0){
                         n= i%10;
                         sum+= n; i/=10;
                  }
                  return (sum);
      }
    public static void main(String[] args){ 
            System.out.print("Nhap n =");
                int n= nhap();
                System.out.println("Tong cua so "+n+" = " +tinhTong(n));
    }
  }




