package nLayeredECommerce;

import nLayeredECommerce.business.concretes.AuthManager;
import nLayeredECommerce.business.concretes.UserManager;
import nLayeredECommerce.dataAccess.concretes.HibernateUserDao;
import nLayeredECommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User(1, "Kerem", "Candangil", "mkcandangil@gmail.com", "511526");
		AuthManager authManager = new AuthManager(new UserManager(new HibernateUserDao()));
		
		authManager.register(user);
	}
}