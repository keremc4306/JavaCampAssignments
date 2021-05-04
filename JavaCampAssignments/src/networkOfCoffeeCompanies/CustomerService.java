package networkOfCoffeeCompanies;

import java.rmi.RemoteException;

public interface CustomerService {
	//Hata firlatma olasiligina karsi Java, önlemi zorunlu kilar
	void save(Customer customer) throws RemoteException;
}
