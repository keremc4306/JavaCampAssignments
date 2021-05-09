package nLayeredECommerce.core.adapters;

import nLayeredECommerce.entities.concretes.User;
import nLayeredECommerce.googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthServiceExternal {
	private final GoogleAuthManager googleAuthManager;
	
	public GoogleAuthManagerAdapter() {
        this.googleAuthManager = new GoogleAuthManager();
    }

	@Override
	public void login(User user) {
		googleAuthManager.login(user);
	}

	@Override
	public void register(User user) {
		googleAuthManager.register(user);
	}

}
