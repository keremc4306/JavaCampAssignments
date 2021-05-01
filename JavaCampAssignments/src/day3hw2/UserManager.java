package day3hw2;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getName() + " kullan�c�s� eklendi.");
	}
	
	public void delete(User user) {
		System.out.println(user.getName() + " kullan�c�s� silindi.");
	}
	
	public void getAll() {
		System.out.println("T�m kullan�c�lar listelendi.");
	}
	
	public void getById() {
		System.out.println("�lgili kullan�c�lar listelendi.");
	}
	
	public void login(String email, String password) {
		System.out.println(email + " mail adresine sahip kullan�c� taraf�ndan giri� yap�ld�.");
	}
	
	public void logout(User user) {
		System.out.println(user.getEmail() + " mail adresine sahip " + user.getName()
							+ "kullan�c� taraf�ndan sistemden ��k�� yap�ld�");
	}
	
	public void update(User user) {
		System.out.println(user.getName() + " kullan�c�s� g�ncellendi.");
	}
}
