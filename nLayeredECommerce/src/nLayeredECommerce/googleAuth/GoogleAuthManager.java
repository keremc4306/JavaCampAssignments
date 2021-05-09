package nLayeredECommerce.googleAuth;

import nLayeredECommerce.entities.concretes.User;

public class GoogleAuthManager implements GoogleAuthService {

	@Override
	public boolean login(User user) {
		System.out.println("Google hesabý ile giriþ yapýldý, " + user.getFirstName());
        return true;
	}

	@Override
	public boolean register(User user) {
		System.out.println("Google hesabý ile kayýt olundu, " + user.getFirstName());
        return true;
	}
}