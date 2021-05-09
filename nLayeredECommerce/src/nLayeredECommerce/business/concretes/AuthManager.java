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
			System.out.println("Giriþ iþlemi baþarýsýz");
			return;
		}	


		if (!this.checkActivationCode(user)) {
			System.out.println("Giriþ iþlemi baþarýsýz");
			System.out.println("Aktivasyon kodunu onaylamadan giriþ yapamazsýnýz");
			return;
		}

		System.out.println("Giriþ iþlemi yapýldý");
	}

	@Override
	public void register(User user) {
		boolean validationResult = RegisterValidation.checkValidate(user);
		if (!validationResult)
			return;

		boolean userExists = userService.getByEmail(user.getEmail().toLowerCase(Locale.ROOT));

		if (userExists) {
			System.out.println("Bu email adresi mevcut lütfen farklý bir adresle deneyin");
			return;
		}

		userService.add(user);
		System.out.println("Kayýt iþlemi baþarýlý");

		user.setActivateCode("MKC267");
		System.out.println("Doðrulama maili gönderildi, E-Postanýzý kontrol edin");
	}

	public void registerWithGoogle(User user) {
		authServiceExternal.register(user);
		System.out.println("Doðrulama maili gönderildi, E-Postanýzý kontrol edin");
	}
	
	// ilk doðrulama
	public boolean confirmActivationCode(User user, String activationCode) {	
		if (activationCode != "") {			
			if(user.getActivateCode().equals(activationCode)) {
				user.setConfirmActivationCode(activationCode);
				return true;
			}			
		}
		return false;
	}
	
	// Modeldeki iki alaný karþýlaþtýr
	public boolean checkActivationCode(User user) {
		
		return user.getActivateCode().equals(user.getConfirmActivationCode());
		
	}

	public void loginWithGoogle(User user){
        if (!this.checkActivationCode(user)){
            System.out.println("Giriþ iþlemi baþarýsýz");
            System.out.println("Aktivasyon kodunu onaylamadan giriþ yapamazsýnýz");
            return;
        }

        authServiceExternal.login(user);
	}
}