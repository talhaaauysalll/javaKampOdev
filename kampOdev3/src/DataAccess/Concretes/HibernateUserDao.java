package DataAccess.Concretes;

import java.util.ArrayList;
import java.util.List;

import DataAccess.Abstracts.UserDao;
import Entities.Concretes.User;

public class HibernateUserDao implements UserDao {

	private List<User> users=new ArrayList<User>();
	@Override
	public void add(User user) {
		this.users.add(user);
		System.out.println("Veritabanýna Hibernate ile kullanýcý eklendi...");
	}

	@Override
	public void delete(User user) {
		this.users.remove(user.getId());
		System.out.println("Veritabanýna Hibernate ile kullanýcý silindi...");
	}

	@Override
	public void update(User user) {
		this.users.set(user.getId(), user);
		System.out.println("Veritabanýndaki kullanýcý Hibernate ile güncellendi...");
	}

	@Override
	public User getById(int id) {
		var result=this.users.get(id);
		System.out.println("Veritabanýndaki "+id+ "'li kullanýcý Hibernate ile getirildi" );
		return result;
	}

	@Override
	public List<User> getAll() {
		for(User user:users) {
			System.out.println(user.getId()+"/"+user.getFirstName()+"/"+user.getLastName());
		}
		System.out.println("Veritabanýndaki tüm kullanýcýlar listelendi");
		return this.users;
		
	}

	
	

}
