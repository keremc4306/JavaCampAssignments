package nLayeredECommerce.business.concretes;

import java.util.Locale;

import nLayeredECommerce.business.abstracts.AuthService;
import nLayeredECommerce.business.abstracts.UserService;
import nLayeredECommerce.business.validations.auth.LoginValidation;
import nLayeredECommerce.business.validations.auth.RegisterValidation;
import nLayeredECommerce.core.adapters.AuthServiceExternal;
import nLayeredECommerce.entities.concretes.User;

public class AuthManager implements AuthService {
	private final UserService userService;
	private final AuthServiceExternal authServiceExternal;

	public AuthManager(UserService userService, AuthServiceExternal authServiceExternal) {
		this.userService = userService;
		this.authServiceExternal = authServiceExternal;
	}

	@Override
	public void login(User user) {
		
		boolean validationResult = LoginValidation.checkValidate(user);

		if (!validationResult) {
			System.out.println("----------------------------");
			System.out.println("Giri� i�lemi ba�ar�s�z");
			return;
		}	


		if (!this.checkActivationCode(user)) {
			System.out.println("Giri� i�lemi ba�ar�s�z");
			System.out.println("Aktivasyon kodunu onaylamadan giri� yapamazs�n�z");
			return;
		}

		System.out.println("Giri� i�lemi yap�ld�");
	}

	@Override
	public void register(User user) {
		boolean validationResult = RegisterValidation.checkValidate(user);
		if (!validationResult)
			return;

		boolean userExists = userService.getByEmail(user.getEmail().toLowerCase(Locale.ROOT));

		if (userExists) {
			System.out.println("Bu email adresi mevcut l�tfen farkl� bir adresle deneyin");
			return;
		}

		userService.add(user);
		System.out.println("Kay�t i�lemi ba�ar�l�");

		user.setActivateCode("MKC267");
		System.out.println("Do�rulama maili g�nderildi, E-Postan�z� kontrol edin");
	}

	public void registerWithGoogle(User user) {
		authServiceExternal.register(user);
		System.out.println("Do�rulama maili g�nderildi, E-Postan�z� kontrol edin");
	}
	
	// ilk do�rulama
	public boolean confirmActivationCode(User user, String activationCode) {	
		if (activationCode != "") {			
			if(user.getActivateCode().equals(activationCode)) {
				user.setConfirmActivationCode(activationCode);
				return true;
			}			
		}
		return false;
	}
	
	// Modeldeki iki alan� kar��la�t�r
	public boolean checkActivationCode(User user) {
		
		return user.getActivateCode().equals(user.getConfirmActivationCode());
		
	}

	public void loginWithGoogle(User user){
        if (!this.checkActivationCode(user)){
            System.out.println("Giri� i�lemi ba�ar�s�z");
            System.out.println("Aktivasyon kodunu onaylamadan giri� yapamazs�n�z");
            return;
        }

        authServiceExternal.login(user);
	}
}