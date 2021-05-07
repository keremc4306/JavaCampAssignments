package nLayeredECommerce.dataAccess.abstracts;

import java.util.List;

import nLayeredECommerce.entities.concretes.User;

public interface UserDao {
	List<User> getAll();
	
	void add(User user);
	void update(User user);
	void delete(User user);
}
