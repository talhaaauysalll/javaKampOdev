package Core.Concretes;

import Core.Abstracts.LoginService;
import ExternalServices.LoginWithGoogleAccountManager;

public class LoginManager implements LoginService {

	@Override
	public void login(String mail, String password) {
		if((mail==null)&&(password==null)){
			System.out.println("e-Posta adresi ve parola bo? ge?ilemez");
		}
		else {
			System.out.println("Sisteme giri? yapt?n?z, ho?geldiniz");
		}
		
	}
	public void loginToGoogleAccountManager() {
		LoginWithGoogleAccountManager loginWithGoogleAccountManager=new LoginWithGoogleAccountManager();
		loginWithGoogleAccountManager.login();
	}

}
