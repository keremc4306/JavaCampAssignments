package nLayeredECommerce.googleAuth;

import nLayeredECommerce.entities.concretes.User;

public interface GoogleAuthService {
	boolean login(User user);
    boolean register(User user);
}