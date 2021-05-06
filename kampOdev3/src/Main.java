import Business.Concretes.UserManager;
import Core.Concretes.LoginManager;
import Core.Concretes.ValidatorManager;
import DataAccess.Concretes.HibernateUserDao;
import Entities.Concretes.User;

public class Main {

	public static void main(String[] args) {
		
		LoginManager loginManager=new LoginManager();
		loginManager.loginToGoogleAccountManager();
		
		
		
		

	}

}
