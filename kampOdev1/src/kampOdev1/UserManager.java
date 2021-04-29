package kampOdev1;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getId()+" - "+user.getName()+" - "+user.getSurname()+" "+"eklendi");
	}
	public void delete(User user) {
		System.out.println(user.getId()+" - "+user.getName()+" - "+user.getSurname()+" "+"silindi");
	}
	public void getAll(User[] users) {
		System.out.println("---------------------");
		for(User user:users) {
			System.out.println(user.getName()+" "+user.getSurname());
		}
	}
}
