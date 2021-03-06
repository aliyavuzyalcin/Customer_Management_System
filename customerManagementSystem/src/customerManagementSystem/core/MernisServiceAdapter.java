package customerManagementSystem.core;


import java.rmi.RemoteException;

import customerManagementSystem.abstracts.ICustomerCheckService;
import customerManagementSystem.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean result = false;
		
		try {
			result = soapClient.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(), 
					customer.getLastName(), customer.getDateOfBirth().getYear());
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	

}
