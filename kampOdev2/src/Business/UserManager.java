package Business;

import Entity.User;

public class UserManager implements UserService{

	Authentication authentication;
	public UserManager(Authentication authentication) {
		this.authentication=authentication;
	}
	
	@Override
	public void register(User user) {
		if(true==authentication.verify(user.getNationalityIdentity().toString() ,user.getFirstName().toString(), user.getLastName().toString(), user.getDateOfBirth().toString())) {
			System.out.println(user.getFirstName()+" "+user.getLastName()+" kullan?c?s? eklendi");
		}
		else {
			System.out.println("Kullan?c? do?rulanmad??? i?in eklenmedi...");
		}
		
		
	}

	@Override
	public void login(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" ho?geldiniz");
	}

}
