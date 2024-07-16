import java.util.*;
public class ShopManager {
	Scanner sc = new Scanner(System.in);
	
	public static void display (int sage) throws InvalidAgeException
	{
		try
		{
			if(sage<16)
			{
				System.out.println("Sorry you are underage");
				throw new InvalidAgeException();
			}
		}
		catch(InvalidAgeException ex)
		{
			System.out.println(ex);
			throw ex;
		}
		} 
	    
	public Customer create() {
		Products pr = new Products();
		Customer cust = null;
		System.out.println("\nPlease enter your name:");
		String user = sc.next();
		System.out.println("Please enter your age");
		int age=sc.nextInt();
		try {
			display(age);
		}
		catch(Exception ex){
			System.out.println("You need to be atleast 16 to continue purchase");
			System.exit(age);
		}
		System.out.println("Enter Phone number:");
		String phn = sc.next();
		System.out.println("Please enter the address:");
		sc.nextLine();
		String adrs = sc.nextLine();
		Vector<String> brand = new Vector<>();
		Vector<Long> price = new Vector<>();
		Vector<Integer> id = new Vector<>();
		Vector<Integer> qty = new Vector<>();
		int ch = 0;
		do {
			System.out.println("\n\n\n\t\t\t Hello "+user+" Welcome to Shopping Mart \n");
			System.out.println("_____________________________________________________________________________________________________________________________");
			System.out.println("\nWhat purchase would you like to make\n");
			System.out.println(
					"\n1. Mobile Phones\n2. Home Appliances\n3. Grocery\n4. Clothing\n5. Furniture\n6. Books\n7. Confirm Order\n8. Proceed to payment");
			System.out.println("Please enter your choice:");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("\nProduct ID \t Product Name \t\t\t\t\t\t Price\n");
				for (int i = 0; i < 5; i++) {
					System.out.println(pr.getId()[i] + " \t\t " + pr.getBrands()[i] + " \t\t " + pr.getPrices()[i]);
				}
				System.out.println("\n6 \t\t Exit \n\n");
				System.out.println("Enter the product id:");
				int ids = sc.nextInt();
				for (int j = 0; j < 5; j++) {
					if (ids == pr.getId()[j]) {
						id.add(ids);
						brand.add(pr.getBrands()[j]);
						price.add(pr.getPrices()[j]);
						System.out.println("Enter quantity:");
						qty.add(sc.nextInt());
					} else if (ids == 6) {
						break;
					}
				}
				break;
			case 2:
				System.out.println("\nProduct ID \t Product Name \t\t\t\t\t\t Price\n");
				for (int i = 5; i < 10; i++) {
					System.out.println(pr.getId()[i] + " \t\t " + pr.getBrands()[i] + " \t\t " + pr.getPrices()[i]);
				}
				System.out.println("\n6 \t\t Exit \n\n");
				System.out.println("Enter the product id:");
				ids = sc.nextInt();
				for (int j = 5; j < 10; j++) {
					if (ids == pr.getId()[j]) {
						id.add(ids);
						brand.add(pr.getBrands()[j]);
						price.add(pr.getPrices()[j]);
						System.out.println("Enter quantity:");
						qty.add(sc.nextInt());
					} else if (ids == 6) {
						break;
					}
				}
				break;
			case 3: 
				System.out.println("\nProduct ID \t Product Name \t\t\t\t\t\t Price\n");
				for (int i =10; i < 15; i++) {
					System.out.println(pr.getId()[i] + " \t\t " + pr.getBrands()[i] + " \t\t " + pr.getPrices()[i]);
				}
				System.out.println("\n6 \t\t Exit \n\n");
				System.out.println("Enter the product id:");
				ids = sc.nextInt();
				for (int j = 10; j < 15; j++) {
					if (ids == pr.getId()[j]) {
						id.add(ids);
						brand.add(pr.getBrands()[j]);
						price.add(pr.getPrices()[j]);
						System.out.println("Enter quantity:");
						qty.add(sc.nextInt());
					} else if (ids == 6) {
						break;
					}
				}
				break;
			case 4:
				System.out.println("\nProduct ID \t Product Name \t\t\t\t\t\t Price\n");
				for (int i = 15; i < 20; i++) {
					System.out.println(pr.getId()[i] + " \t\t " + pr.getBrands()[i] + " \t\t " + pr.getPrices()[i]);
				}
				System.out.println("\n6 \t\t Exit \n\n");
				System.out.println("Enter the product id:");
				ids = sc.nextInt();
				for (int j = 15; j < 20; j++) {
					if (ids == pr.getId()[j]) {
						id.add(ids);
						brand.add(pr.getBrands()[j]);
						price.add(pr.getPrices()[j]);
						System.out.println("Enter quantity:");
						qty.add(sc.nextInt());
					} else if (ids == 6) {
						break;
					}
				}
				break;
			case 5:
				System.out.println("\nProduct ID \t Product Name \t\t\t\t\t\t Price\n");
				for (int i = 20; i < 25; i++) {
					System.out.println(pr.getId()[i] + " \t\t " + pr.getBrands()[i] + " \t\t " + pr.getPrices()[i]);
				}
				System.out.println("\n6 \t\t Exit \n\n");
				System.out.println("Enter the product id:");
				ids = sc.nextInt();
				for (int j = 20; j < 25; j++) {
					if (ids == pr.getId()[j]) {
						id.add(ids);
						brand.add(pr.getBrands()[j]);
						price.add(pr.getPrices()[j]);
						System.out.println("Enter quantity:");
						qty.add(sc.nextInt());
					} else if (ids == 6) {
						break;
					}
				}
				break;
			case 6:
				System.out.println("\nProduct ID \t Product Name \t\t\t\t\t\t Price\n");
				for (int i = 25; i < 30; i++) {
					System.out.println(pr.getId()[i] + " \t\t " + pr.getBrands()[i] + " \t\t " + pr.getPrices()[i]);
				}
				System.out.println("\n6 \t\t Exit \n\n");
				System.out.println("Enter the product id:");
				ids = sc.nextInt();
				for (int j = 25; j < 30; j++) {
					if (ids == pr.getId()[j]) {
						id.add(ids);
						brand.add(pr.getBrands()[j]);
						price.add(pr.getPrices()[j]);
						System.out.println("Enter quantity:");
						qty.add(sc.nextInt());
					} else if (ids == 6) {
						break;
					}
				}
				break;
			case  7:
			    System.out.println("\nCART");
				cust=new Customer(user, age, brand, price, id, qty);
				display(cust);
				break;
			}
		} while (ch != 8);
		
		cust=new Customer(user, age, brand, price, id, qty);
		String ch1="n";
		boolean bool=false;
		if(cust.getBrand().isEmpty()) {
			System.out.println("You cart is Empty!!");
			System.out.println("Thank you visit again");
			bool=false;
		}
		else {
			do{
				bool=true;
				if(cust.getBrand().isEmpty()) {
					System.out.println("You cart is Empty!!");
					System.out.println("Thank you visit again");
					bool=false;
					break;
				}
				display(cust);
				System.out.println("\nDo you want to change quantity of any product? [y/n]:");
				String ch2=sc.next();
				if(ch2.equals("Y")||ch2.equals("y")) {
					System.out.println("Enter the product id:");
					int se=sc.nextInt();
					boolean b=false;
					for(int i=0;i<cust.getBrand().size();i++) {
						if(cust.getId().get(i)==se) {
							b=true;
							System.out.println("\t\t1. Completely remove the item \n\t\t2. Reduce quantity be 1 \n\t\t3. Increase quantity be 1");
							System.out.println("Enter your choice:");
							int choice=sc.nextInt();
							switch(choice) {
							case 1:
								cust.getBrand().remove(i);
								cust.getId().remove(i);
								cust.getQty().remove(i);
								cust.getPrice().remove(i);
								cust.getTotal().remove(i);
								break;
							case 2:
								cust.getQty().set(i, cust.getQty().get(i)-1);
								cust.getTotal().set(i, cust.getTotal().get(i)-cust.getPrice().get(i));
								if(cust.getQty().get(i)==0) {
									cust.getBrand().remove(i);
									cust.getId().remove(i);
									cust.getQty().remove(i);
									cust.getPrice().remove(i);
									cust.getTotal().remove(i);
								}
								break;
							case 3:
								cust.getQty().set(i, cust.getQty().get(i)+1);
								cust.getTotal().set(i, cust.getTotal().get(i)+cust.getPrice().get(i));
								break;
							}
						}
					}
					if(!b) {
						System.out.println("This Product is not present in your cart!!!!");
					}
				}
				display(cust);
				System.out.println("\nDo you want to finalise the list? [y/n] :");
				ch1=sc.next();
			}while(ch1.equals("N")||ch1.equals("n"));
		}
		Payment();
		return cust;
	}
	
	public void Payment() {
		int choose,bank;
		String card,otp;
		System.out.println("\nPayment Options:\n\t1. Online payment \n\t2. Cash on delivery \nChoose your payment method:");
		choose=sc.nextInt();
		switch(choose)
		{
			case 1:
				System.out.println("\n\n1. State Bank of India \n2. Bank of Baroda \n3. Bank of Maharashtra \n4. IDBI Bank \n5. Axis Bank \n6. ICICI Bank\nChoose the Bank for Payment:");
				bank=sc.nextInt();
				System.out.println("\nEnter your 12 digit Debit Card Number:");
				card=sc.next();
		    	while(card.length()!=12)
				{
	       			System.out.println("Incorrect Debit card number!!");
					System.out.println("\nRe-Enter the Debit card Number:");
					card=sc.next();
				}
		    	
				System.out.println("Enter the sent OTP sent to your rgistered mobile number :");
				otp=sc.next();
				System.out.println("Processing");
				for(int i=0;i<3;i++)
				{
					System.out.println(".");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("\nTransaction Done. You order will arrive in 1-2 Weeks");
				System.out.println("\n\n--------------------------------------------------Please Visit Again----------------------------------------------------------------");
				break;
			case 2:
				System.out.println("You have choosen Cash on delivery. \nYour order will arrive in 1- 2 Weeks");
				System.out.println("\n\n--------------------------------------------------Please Visit Again----------------------------------------------------------------");
				break;
			default:
				System.out.println("Choice a Valid Payment option");
		}
		
		
	}
	
	
	
	
	public void search(Customer cust,int srch) {
		boolean b=false;
		for(int i=0;i<cust.getBrand().size();i++) {
			if(srch==cust.getId().get(i)) {
				b=true;
				System.out.println("\nProduct ID \t Product Name \t\t\t\t\t\t Price  \tQuantity \t Cgst \t Sgst \t Total\n");
				System.out.println(cust.getId().get(i) + " \t\t " + cust.getBrand().get(i) + " \t\t " + cust.getPrice().get(i)+"\t\t"+cust.getQty().get(i)+"\t\t"+cust.getCgst()+"\t"+cust.getSgst()+"\t"+cust.getTotal().get(i));	
			}
		}
		if(!b) {
			System.out.println("This product is not in your cart. Take a look on exclusive offers on the product!!");
		}
	}
	public void display(Customer cust) {
		double finalTotal=0;
		System.out.println("\nProduct ID \t Product Name \t\t\t\t\t\t Price  \tQuantity \t Cgst \t Sgst \t Total\n");
		for(int i=0;i<cust.getBrand().size();i++) {
			System.out.println(cust.getId().get(i) + " \t\t " + cust.getBrand().get(i) + " \t\t " + cust.getPrice().get(i)+"\t\t"+cust.getQty().get(i)+"\t\t"+cust.getCgst()+"\t"+cust.getSgst()+"\t"+cust.getTotal().get(i));		
			finalTotal=finalTotal+cust.getTotal().get(i);
		}
		cust.setFinaltotal(finalTotal);                                           
		System.out.println("\n\n------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\nFinal Total is :  "+cust.getFinaltotal());
	}
}
