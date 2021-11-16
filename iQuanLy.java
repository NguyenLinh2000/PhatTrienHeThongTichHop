package quanlysinhvien;

import java.rmi.Remote;
import java.rmi.RemoteException;

public  interface  iQuanLy extends Remote {
	public boolean them(SinhVien sv)throws RemoteException;
	public  boolean xoa(String id)throws RemoteException;
	public boolean sua(SinhVien sv)throws RemoteException;
	public String xem()throws RemoteException;
}
