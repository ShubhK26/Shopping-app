import java.rmi.*;
public class rmiServer {
    public static void main(String[] args) {
        try {
            remoteMeth meth = new remoteMeth();
            Naming.rebind("rmi:///mathMeth",meth);
            System.out.println("Server Ready");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}