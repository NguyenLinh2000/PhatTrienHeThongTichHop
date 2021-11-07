

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    
    public static void main(String[] args) {
        try {
            HelloImpl obj = new HelloImpl();
            System.out.println("Exporting .....");

            LocateRegistry.createRegistry(6789);
            Registry reg = LocateRegistry.getRegistry(6789);

            reg.bind("HelloObj", obj);

            System.out.println("Server runing...");

        } catch (Exception e) {
            // TODO: handle exception
        }      
    }    

}
