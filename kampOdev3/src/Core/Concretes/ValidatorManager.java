package Core.Concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Core.Abstracts.ValidatorService;
import Entities.Concretes.User;

public class ValidatorManager implements ValidatorService{

	@Override
	public boolean checkIfPassword(String password) {
		if(password.length()>6) {
			return true;
		}
		else {
			System.out.println("Parola Altý Karakterden Fazla Olmalýdýr.");
			return false;
		}
		
	}
	private static final String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	@Override
	public boolean checkIfeMailRegex(String email) {
		Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		if(pattern.matcher(email).find()) {
			return true;
		}
		else {
			System.out.println("Geçersiz bir mail adresi girdiniz");
			return false;
		}
		
	}

	@Override
	public boolean checkIfFirstNameLastName(String firstName, String lastName) {
		if((firstName.length()>2)&&(lastName.length()>2)){
			return true;
		}
		else {
			System.out.println("Ad ve Soyad iki harften fazla olmalýdýr.");
			return false;
		}
		
	}

	
	

	

}
