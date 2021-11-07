//package RMIDemo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloInterface extends Remote {
    String printHello() throws RemoteException;
    
    String daonguoc(String ten)throws RemoteException;
    int countWords(String ten)throws RemoteException;
}
