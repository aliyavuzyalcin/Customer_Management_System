package customerManagementSystem;

import java.util.Date;

import customerManagementSystem.abstracts.BaseCustomerManager;
import customerManagementSystem.concrete.NeroCustomerManager;
import customerManagementSystem.concrete.StarbucksCustomerManager;
import customerManagementSystem.core.MernisServiceAdapter;
import customerManagementSystem.entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer(1, "Ali Yavuz", "Yalçýn", new Date(1995,10,13), "..131053...");
		
		//BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		//customerManager.save(customer);
		
		BaseCustomerManager customerManager2 = new NeroCustomerManager();
		customerManager2.save(customer);
		
	

	}

}
