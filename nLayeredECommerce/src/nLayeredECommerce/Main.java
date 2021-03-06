package nLayeredECommerce;

import nLayeredECommerce.business.concretes.AuthManager;
import nLayeredECommerce.business.concretes.UserManager;
import nLayeredECommerce.core.adapters.GoogleAuthManagerAdapter;
import nLayeredECommerce.dataAccess.concretes.HibernateUserDao;
import nLayeredECommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User(1, "Kerem", "Candangil", "kerem2@mkerem.com", "423145");
		AuthManager authManager = new AuthManager(new UserManager(new HibernateUserDao()), 
				new GoogleAuthManagerAdapter());
		
		System.out.println("----------------------------");
		authManager.register(user);
		
		System.out.println("----------------------------");
		
	
		
		user.setConfirmActivationCode("MKC267");
		

		authManager.confirmActivationCode(user, "MKC267"); 
		
        authManager.login(user);
        
        authManager.loginWithGoogle(user);
	}
}