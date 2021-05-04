package networkOfCoffeeCompanies;

import java.rmi.RemoteException;

public class NeroCustomerManager extends BaseCustomerManagerService {
	private CustomerCheckService checkService;
	
	public NeroCustomerManager(CustomerCheckService checkService) {
		this.checkService = checkService;
	}
	
	@Override
	public void save(Customer customer) throws RemoteException {
		if(this.checkService.checkIfRealPerson(customer)) {
			//kosullarin saglanmasi durumunda, base classtaki save metodunu cagirir ve calistirir
			//super keywordu base classtaki erisim icin
			super.save(customer);
		}
		else {
			System.out.println("Not a valid person");
		}
	}

}
