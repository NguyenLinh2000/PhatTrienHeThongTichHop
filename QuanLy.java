package quanlysinhvien;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;

public class QuanLy extends UnicastRemoteObject implements iQuanLy {
	
	
	private static final long serialVersionUID = 1L;
	HashMap<String, SinhVien> data=new HashMap<String, SinhVien>();
	
	public  QuanLy() throws  RemoteException {
		
	}
	 
	public boolean them(SinhVien sv) throws RemoteException {
		if(!data.containsKey(sv.getId())) {
			data.put(sv.getId(), sv);
			return true;
		}
		return false;
	} 
	
	public  boolean xoa(String id) throws RemoteException {
		if(data.containsKey(id)) {
			data.remove(id);
			return true;
		}
		return false;
	}
	
	public boolean sua(SinhVien sv) throws RemoteException {
		if(data.containsKey(sv.getId())) {
			data.put(sv.getId(), sv);
			return true;
		}
		return false;
	}
	
	public String xem() throws RemoteException {
		String tmp="";
		for(SinhVien sv: data.values()) {
			tmp+=sv.toString()+"\n";
		}
		return tmp ;
	}
}
