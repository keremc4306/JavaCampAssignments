package nLayeredECommerce.core.adapters;

import nLayeredECommerce.entities.concretes.User;

public interface AuthServiceExternal {
	void login(User user);
	void register(User user);
}