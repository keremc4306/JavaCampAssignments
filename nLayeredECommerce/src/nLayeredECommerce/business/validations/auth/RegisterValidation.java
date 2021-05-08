package nLayeredECommerce.business.validations.auth;

import java.util.Locale;

import nLayeredECommerce.core.extensions.regex.MailRegex;
import nLayeredECommerce.entities.concretes.User;

public class RegisterValidation implements Validation {
	public static boolean checkValidate(User user){
        boolean result = checkEmailFormat(user.getEmail());
        if (result) {
            result = checkPasswordLength(user.getPassword());
        }

        return result;
    }

    private static boolean checkEmailFormat(String email){
        boolean result = MailRegex.emailControl(email.toLowerCase(Locale.ROOT));

        if (!result)
            System.out.println("Geçersiz format! Email adresinizi kontrol edin");

        return result;
    }

    private static boolean checkPasswordLength(String password){
        boolean result = true;

        if (password.length() < 6){
            System.out.println("Þifreniz en az 6 karakter olmalýdýr");
            result = false;
        }

        return result;
    }
}