package networkOfCoffeeCompanies;

import java.rmi.RemoteException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Nationality ID : ");  
		String nationalityId = sc.nextLine();
		
		System.out.print("Enter First Name : ");  
		String firstName = sc.nextLine();
		
		System.out.print("Enter Last Name : ");  
		String lastName = sc.nextLine();
		
		System.out.print("Enter Birth Year : ");  
		int birthYear = sc.nextInt();
		
		Customer customer = new Customer(1, firstName, lastName, birthYear, nationalityId);
		
		BaseCustomerManagerService neroManager = new NeroCustomerManager(new CustomerCheckManager());
		neroManager.save(customer);
	}

}
