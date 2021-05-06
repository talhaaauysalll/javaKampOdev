package Core.Concretes;

import Core.Abstracts.LoginService;
import ExternalServices.LoginWithGoogleAccountManager;

public class LoginManager implements LoginService {

	@Override
	public void login(String mail, String password) {
		if((mail==null)&&(password==null)){
			System.out.println("e-Posta adresi ve parola boþ geçilemez");
		}
		else {
			System.out.println("Sisteme giriþ yaptýnýz, hoþgeldiniz");
		}
		
	}
	public void loginToGoogleAccountManager() {
		LoginWithGoogleAccountManager loginWithGoogleAccountManager=new LoginWithGoogleAccountManager();
		loginWithGoogleAccountManager.login();
	}

}
