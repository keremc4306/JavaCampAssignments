package networkOfCoffeeCompanies;

import java.rmi.RemoteException;

public abstract class BaseCustomerManagerService implements CustomerService {

	@Override
	public void save(Customer customer) throws RemoteException {
		System.out.println("Saved : " + customer.name.toUpperCase() + " " 
						+ customer.lastName.toUpperCase());
		
	}

}
