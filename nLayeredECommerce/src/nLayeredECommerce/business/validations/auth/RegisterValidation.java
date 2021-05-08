package nLayeredECommerce.business.validations.auth;

import java.util.Locale;

import nLayeredECommerce.core.extensions.regex.MailRegex;
import nLayeredECommerce.entities.concretes.User;

public class RegisterValidation implements Validation {
	private static boolean resultOfRule = true;
	
	public static boolean checkValidate(User user){
		checkEmailFormat(user.getEmail());
        checkPasswordLength(user.getPassword());
        checkMinLength(user.getFirstName(), user.getLastName());

        return resultOfRule;
    }

    private static void checkEmailFormat(String email){
    	resultOfRule = MailRegex.emailControl(email.toLowerCase(Locale.ROOT));

        if (!resultOfRule)
            System.out.println("Ge�ersiz format! Email adresinizi kontrol edin");
    }

    private static void checkPasswordLength(String password){
        if (password.length() < 6){
            System.out.println("�ifreniz en az 6 karakter olmal�d�r");
            resultOfRule = false;
        }
    }
    
    public static void checkMinLength(String firstName, String lastName) {
        if (firstName.length() < 2) {
            System.out.println("Ad en az 2 karakter olmal�d�r");
            resultOfRule = false;
        }

        if (lastName.length() < 2) {
            System.out.println("Soyad en az 2 karakter olmal�d�r");
            resultOfRule = false;
        }
    }
}