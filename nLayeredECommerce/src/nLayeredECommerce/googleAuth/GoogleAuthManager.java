package nLayeredECommerce.googleAuth;

import nLayeredECommerce.entities.concretes.User;

public class GoogleAuthManager implements GoogleAuthService {

	@Override
	public boolean login(User user) {
		System.out.println("Google hesab� ile giri� yap�ld�, " + user.getFirstName());
        return true;
	}

	@Override
	public boolean register(User user) {
		System.out.println("Google hesab� ile kay�t olundu, " + user.getFirstName());
        return true;
	}
}