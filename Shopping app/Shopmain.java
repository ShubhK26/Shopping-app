import Mypack.*;
import java.util.*;
public class Shopmain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Mypack.Intro i=new Mypack.Intro();
		i.display();
		ShopManager mg=new ShopManager();
		Vector<Customer> cust=new Vector<>();
		mg.create();
	}

}
