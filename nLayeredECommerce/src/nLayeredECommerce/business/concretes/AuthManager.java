package nLayeredECommerce.business.concretes;

import java.util.Locale;

import nLayeredECommerce.business.abstracts.AuthService;
import nLayeredECommerce.business.abstracts.UserService;
import nLayeredECommerce.core.extensions.regex.MailRegex;
import nLayeredECommerce.entities.concretes.User;

public class AuthManager implements AuthService {
	UserService userService;
	
	public AuthManager(UserService userService) {
		this.userService = userService;
	}

	@Override
	public void login(User user) {
		System.out.println("Giri� i�lemi yap�ld�");
	}

	@Override
	public void register(User user) {
		boolean checkMail = MailRegex.emailControl(user.getEmail());
		boolean userExists = userService.getByEmail(user.getEmail().toLowerCase(Locale.ROOT));
		
		if (user.getPassword().length() < 6) {
			System.out.println("Parola en az 6 karakterden olu�mal�d�r.");
			return;
		}

		if (!checkMail) {
			System.out.println("Ge�ersiz format! L�tfen email adresinizi kontrol edin");
			return;
		}

		if (userExists) {
			System.out.println("Bu email adresi mevcut l�tfen farkl� bir adresle deneyin");
			return;
		}
		
		userService.add(user);
        System.out.println("Kay�t i�lemi ba�ar�l�");
	}

}
