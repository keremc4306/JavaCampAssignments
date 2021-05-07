package nLayeredECommerce.business.abstracts;

import nLayeredECommerce.entities.concretes.User;

public interface UserService {
	boolean getByEmail(String email);
	
	void add(User user);
	void delete(User user);
	void update(User user);
}