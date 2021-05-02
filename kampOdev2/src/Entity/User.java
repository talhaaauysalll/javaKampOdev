package Entity;

public class User implements Entity  {
	private int id;
	private String nationalityIdentity;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String email;
	private String password;
	public User() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNationalityIdentity() {
		return nationalityIdentity;
	}
	public void setNationalityIdentity(String nationalityIdentity) {
		this.nationalityIdentity = nationalityIdentity;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
