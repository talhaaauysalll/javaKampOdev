package Core.Abstracts;



public interface ValidatorService {
	boolean checkIfPassword(String password);
	boolean checkIfeMailRegex(String email);
	boolean checkIfFirstNameLastName(String firstName,String lastName);
	
}
