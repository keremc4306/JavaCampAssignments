package nLayeredECommerce;

import nLayeredECommerce.business.concretes.UserManager;
import nLayeredECommerce.dataAccess.concretes.HibernateUserDao;

public class Main {

	public static void main(String[] args) {
		UserManager userManager = new UserManager(new HibernateUserDao());
		boolean userExists =  userManager.getByEmail("keremc4306@gmail.com");
		System.out.println(userExists);
	}

}
