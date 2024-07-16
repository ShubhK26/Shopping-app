import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
public class remoteMeth extends UnicastRemoteObject implements mathMeth{
    remoteMeth()throws RemoteException{
        super();
    }
    public int add(int x,int y){
        return x + y;
    }
    public int mul(int x,int y){
        return x*y;
    }
}