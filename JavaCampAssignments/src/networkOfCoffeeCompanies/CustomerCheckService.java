package networkOfCoffeeCompanies;

import java.rmi.RemoteException;

public interface CustomerCheckService {
	//Hata firlatma olasiligina karsi Java, �nlemi zorunlu kilar
	boolean checkIfRealPerson(Customer customer) throws RemoteException;
}
