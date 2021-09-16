import java.util.Scanner;

public class Bai2KtSNT {

     // Ham Kiem tra n co phai la so nguyen to hay khong
     public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

		Scanner sn=new Scanner(System.in);

        System.out.print("Nhập vào số nguyên n = ");
        int n=sn.nextInt();

        if(isPrime(n)){
            System.out.println(n+" là số nguyên tố!");
        } else {
            System.out.println(n+" không là số nguyên tố!");
        }

        sn.close();
    }

	
}