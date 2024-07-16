import java.rmi.*;
import java.util.*;
public class rmiClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            mathMeth mathMeth = (mathMeth) Naming.lookup("rmi://127.0.0.1/mathMeth");
            System.out.println("Addition :"+mathMeth.add(a,b));
            System.out.println("Multiplication :"+mathMeth.mul(a,b));
        }catch (Exception e){
            e.printStackTrace();
        }
}
}