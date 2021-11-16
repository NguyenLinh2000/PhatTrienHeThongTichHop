package quanlysinhvien;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class ChuongTrinh {
	String sout="1- xem danh sach Sinh Vien\n2- Them Sinh Vien"
			+ "\n3 -Cap nhat danh sach sinh vien\n4- Xoa sinh vien\n5- Thoat\n" ;
	
	public ChuongTrinh() throws RemoteException, NotBoundException {
		
		Registry r=LocateRegistry.getRegistry(1077);		
		iQuanLy ql =(iQuanLy) r.lookup("iq");
		
		Scanner  in = new Scanner(System.in);
		String line;
		while(true) {
			System.out.println(sout);
			line = in.nextLine();
			switch (line) {
			case "1":	
				System.out.println("Danh sach sinh vien nhu sau");
				System.out.println(ql.xem());
				
				break;
				
			case "2":			
				SinhVien sv= new SinhVien();
				System.out.print("Nhap ID cua Sinh Vien : ");
				sv.setId(in.nextLine());
				System.out.print("Nhap ho ten cua Sinh Vien: ");
				sv.setName(in.nextLine());
				System.out.print("Nhap Diem cua Sinh Vien: ");
				sv.setScore(in.nextDouble());
				in.nextLine();
				System.out.print("Nhap Lop cua Sinh Vien: ");
				sv.setClassName(in.nextLine());
				if(ql.them(sv))
					System.out.println("Them sinh vien thanh cong");
				else
					System.out.println("Sinh vien da ton tai");
				break;
				
			case "3":			
				sv= new SinhVien();
				System.out.print("Nhap ID cua Sinh Vien : ");
				sv.setId(in.nextLine());
				System.out.print("Nhap ho ten cua Sinh Vien: ");
				sv.setName(in.nextLine());
				System.out.print("Nhap Diem cua Sinh Vien: ");
				sv.setScore(in.nextDouble());
				in.nextLine();
				System.out.print("Nhap Lop cua Sinh Vien: ");
				sv.setClassName(in.nextLine());
				if(ql.sua(sv))
					System.out.println("Cap nhat sinh vien thanh cong");
				else
					System.out.println("Sinh vien da ton tai");
				break;
				
			case "4":	
				System.out.print("\tNhap ID Sinh vien can xoa: ");
				
				if(ql.xoa(in.nextLine()))
					System.out.println("da xoa thanh cong!");
				else
					System.out.println("Sinh vien khong ton tai");
				break;
				
			case "5":	
				System.exit(1);
				break;
				
			default:
				System.out.println("Nhap sai ");
				break;
			}
		}
	}
	
	public static void main(String[] args) {	
		
		try {
			new ChuongTrinh();
		} catch (RemoteException | NotBoundException e) {
			
			e.printStackTrace();
		}
	}
}
