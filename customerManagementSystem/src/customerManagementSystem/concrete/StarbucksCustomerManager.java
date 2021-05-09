package customerManagementSystem.concrete;

import customerManagementSystem.abstracts.BaseCustomerManager;
import customerManagementSystem.abstracts.ICustomerCheckService;
import customerManagementSystem.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private ICustomerCheckService customerCheckService;
	
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}


	@Override
	public void save(Customer customer) {
		
		try {
			if(customerCheckService.checkIfRealPerson(customer)) {
				
			System.out.println("Saved to database : " + customer.getFirstName() + " " + customer.getLastName());
		}
			} catch (Exception e) {
				
			System.out.println("Not a valid person");
		}
		
	}

}
