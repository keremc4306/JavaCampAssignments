package nLayeredECommerce.business.concretes;

import java.util.Locale;

import nLayeredECommerce.business.abstracts.AuthService;
import nLayeredECommerce.business.abstracts.UserService;
import nLayeredECommerce.business.validations.auth.RegisterValidation;
import nLayeredECommerce.entities.concretes.User;

public class AuthManager implements AuthService {
	UserService userService;

	public AuthManager(UserService userService) {
		this.userService = userService;
	}

	@Override
	public void login(User user) {
		System.out.println("Giriþ iþlemi yapýldý");
	}

	@Override
	public void register(User user) {
		boolean validationResult = RegisterValidation.checkValidate(user);
		if (!validationResult)
			return;
		
		boolean userExists = userService.getByEmail(user.getEmail().toLowerCase(Locale.ROOT));
		
		if (userExists){
            System.out.println("Bu email adresi mevcut lütfen farklý bir adresle deneyin");
            return;
        }
		
		userService.add(user);
        System.out.println("Kayýt iþlemi baþarýlý");
	}
}