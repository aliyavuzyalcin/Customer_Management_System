package customerManagementSystem.abstracts;

import customerManagementSystem.entities.Customer;

public interface ICustomerCheckService {
	
	boolean checkIfRealPerson(Customer customer);

}
