

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements HelloInterface {
    public HelloImpl() throws RemoteException {
        super();
    }

    public String printHello() {
        return "Hello RMI ....";
    }

    public String daonguoc(String ten){
        return ten;
    }
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';

    public  int countWords(String ten) {
        if (ten == null) {
            return -1;
        }
        int count = 0;
        int size = ten.length();
        boolean notCounted = true;
        for (int i = 0; i < size; i++) {
            if (ten.charAt(i) != SPACE && ten.charAt(i) != TAB 
                    && ten.charAt(i) != BREAK_LINE) {
                if(notCounted) {
                    count++;
                    notCounted = false;
                }
            } else {
                notCounted = true;
            }
        }
        return count;
    }

}
