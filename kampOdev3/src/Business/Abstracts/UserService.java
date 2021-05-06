package Business.Abstracts;

import java.util.List;

import Entities.Concretes.User;

public interface UserService {
	void add(User user);
	void update(User user);
	void delete(User user);
	User getById(int id);
	List<User> getAll();
}
