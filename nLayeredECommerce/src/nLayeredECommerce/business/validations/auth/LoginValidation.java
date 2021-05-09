package nLayeredECommerce.business.validations.auth;

import nLayeredECommerce.entities.concretes.User;

public class LoginValidation {
	private static boolean resultOfRule = true;

    public static boolean checkValidate(User user) {
        required("Email", user.getEmail());
        required("Password", user.getPassword());

        return resultOfRule;
    }

    private static void required(String key, String value) {
        if (value == null || value.length() == 0) {
            System.out.println(key + " Alaný zorunludur.");
            resultOfRule = false;
        }
    }
}