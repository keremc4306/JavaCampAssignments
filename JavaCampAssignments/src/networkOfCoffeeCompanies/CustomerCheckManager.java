package networkOfCoffeeCompanies;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) throws RemoteException {
		//Hata firlatma olasiligina karsi Java, önlemi zorunlu kilar
		KPSPublicSoapProxy kpsPublicSoap = new KPSPublicSoapProxy();
		
		boolean result = kpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(customer.nationalityId), customer.name.toUpperCase(), 
				customer.lastName.toUpperCase(),customer.dateOfBirth);
		
		return result;
	}
	
}
