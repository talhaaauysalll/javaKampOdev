package Business.Concretes;

import java.util.List;

import Business.Abstracts.UserService;
import Core.Abstracts.ValidatorService;
import DataAccess.Abstracts.UserDao;
import Entities.Concretes.User;

public class UserManager implements UserService{

	private UserDao userDao;
	private ValidatorService validatorService;
	public UserManager(UserDao userDao,ValidatorService validatorService) {
		this.userDao = userDao;
		this.validatorService=validatorService;
	}

	@Override
	public void add(User user) {
		if((validatorService.checkIfPassword(user.getPassword()))
			&&(validatorService.checkIfeMailRegex(user.getEmail()))
			&&(validatorService.checkIfFirstNameLastName(user.getFirstName(), user.getLastName()))) {
			System.out.println("?yeli?iniz ba?ar?l? bir ?ekilde ger?ekle?mi?tir, "
					+ "do?rulama epostas? mailinize iletilmi?tir");
			System.out.println("Do?rulama linkine t?klayarak ?yeli?inizi tamamlay?n?z...");
			this.userDao.add(user);
		}
		else {
			System.out.println("??lem ba?ar?s?zd?r, l?tfen tekrar deneyiniz");
		}
		
		
		
	}

	@Override
	public void update(User user) {
		if((validatorService.checkIfPassword(user.getPassword()))
				&&(validatorService.checkIfeMailRegex(user.getEmail()))
				&&(validatorService.checkIfFirstNameLastName(user.getFirstName(), user.getLastName()))) {
				System.out.println("?yeli?iniz ba?ar?l? bir ?ekilde g?ncellenmi?tir...");
				this.userDao.update(user);		
				
			}
			else {
				System.out.println("??lem ba?ar?s?zd?r, l?tfen tekrar deneyiniz");
			}
		
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);;
		System.out.println("Kayd?n?z ba?ar?l? bir ?ekilde silinmi?tir...");
		
	}

	@Override
	public User getById(int id) {
		var result=this.userDao.getById(id);
		return result;
	}

	@Override
	public List<User> getAll() {
		
		return this.userDao.getAll();
	}
	

}
