package nLayeredECommerce.business.concretes;

import java.util.List;

import nLayeredECommerce.business.abstracts.UserService;
import nLayeredECommerce.dataAccess.abstracts.UserDao;
import nLayeredECommerce.entities.concretes.User;

public class UserManager implements UserService {
	private final UserDao userDao;
	
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean getByEmail(String email) {
		List<User> users = userDao.getAll();
		return users.stream().anyMatch(
				user -> user.getEmail().contains(email));
	}

	@Override
	public void add(User user) {
		userDao.add(user);
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}
}