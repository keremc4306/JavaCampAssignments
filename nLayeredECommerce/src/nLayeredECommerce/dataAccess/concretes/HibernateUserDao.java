package nLayeredECommerce.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import nLayeredECommerce.dataAccess.abstracts.UserDao;
import nLayeredECommerce.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public List<User> getAll() {
		User user = new User(1, "Kerem", "Candangil", "keremc4306@gmail.com", "423145");
		List<User> users = new ArrayList<User>();
		users.add(user);
		
		return users;
	}

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile eklendi, " + user.getFirstName());
	}

	@Override
	public void update(User user) {
		System.out.println("Hibernate ile guncellendi, " + user.getFirstName());
	}

	@Override
	public void delete(User user) {
		System.out.println("Hibernate ile silindi, " + user.getFirstName());
	}
	
}