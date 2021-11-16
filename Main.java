package quanlysinhvien;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {

	public static void main(String[] args)throws RemoteException {
		
		Registry r=LocateRegistry.createRegistry(1077);
		iQuanLy iq=new QuanLy();
		///quan ba dich vu
		r.rebind("iq", iq);
		System.out.println("Server is runing...");
	}

}
