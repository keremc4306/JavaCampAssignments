package day3hw2;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getName() + " kullanýcýsý eklendi.");
	}
	
	public void delete(User user) {
		System.out.println(user.getName() + " kullanýcýsý silindi.");
	}
	
	public void getAll() {
		System.out.println("Tüm kullanýcýlar listelendi.");
	}
	
	public void getById() {
		System.out.println("Ýlgili kullanýcýlar listelendi.");
	}
	
	public void login(String email, String password) {
		System.out.println(email + " mail adresine sahip kullanýcý tarafýndan giriþ yapýldý.");
	}
	
	public void logout(User user) {
		System.out.println(user.getEmail() + " mail adresine sahip " + user.getName()
							+ "kullanýcý tarafýndan sistemden çýkýþ yapýldý");
	}
	
	public void update(User user) {
		System.out.println(user.getName() + " kullanýcýsý güncellendi.");
	}
}
