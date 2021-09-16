package Tuan2;

import java.util.Scanner;
 
public class Bai4Tongsonhap {
 
    public static void main(String[] args) {
         
        long sum = 0;
        int n;
        Scanner nhap;
        do {
            System.out.print("Input n = ");
            nhap = new Scanner(System.in);
            n = nhap.nextInt();
        }while(n <= 0);
         
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
         
        System.out.println("Tong so tu 1 den " + n +" = " + sum);
        nhap.close();
    }
}