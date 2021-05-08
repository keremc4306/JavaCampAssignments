package nLayeredECommerce.business.abstracts;

import nLayeredECommerce.entities.concretes.User;

public interface AuthService {
	void login(User user);
	void register(User user);
}