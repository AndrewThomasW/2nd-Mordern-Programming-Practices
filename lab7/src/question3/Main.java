package question3;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	@SuppressWarnings({ "serial", "unused" })
	public static void main(String[] args) {
		
		//lists
		List<Customer> list1 = new ArrayList<Customer>();
		List<Customer> list2 = new ArrayList<Customer>();
		
		//adding customers
		list1.add(new Customer("Andrew", "@8f8r"));
		list1.add(new Customer("Charles", "$54@5"));
		list2.add(new Customer("Didier", "12345"));
		list2.add(new Customer("Marcus", "united"));
		
	
		login(list1);
		showLoggedIn();
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			
		}
		showLoggedIn();
		

	}
	
	private static void login(List<Customer> list) {
		List<String> storageList = new ArrayList<>();
		StaticStorage.INSTANCE.add(StorageKey.LOGGED_IN.toString(), storageList);
		for(Customer c : list) {
			storageList.add(c.getName());
		}
	}
	@SuppressWarnings("unchecked")
	private static void showLoggedIn() {
		List<String> stored 
		  = (List<String>)StaticStorage.INSTANCE
		      .get(StorageKey.LOGGED_IN.toString());
		String output = "Currently logged in Customers:";
		System.out.println(output + "\n" + stored);
	}

}
