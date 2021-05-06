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
			System.out.println("Üyeliðiniz baþarýlý bir þekilde gerçekleþmiþtir, "
					+ "doðrulama epostasý mailinize iletilmiþtir");
			System.out.println("Doðrulama linkine týklayarak üyeliðinizi tamamlayýnýz...");
			this.userDao.add(user);
		}
		else {
			System.out.println("Ýþlem baþarýsýzdýr, lütfen tekrar deneyiniz");
		}
		
		
		
	}

	@Override
	public void update(User user) {
		if((validatorService.checkIfPassword(user.getPassword()))
				&&(validatorService.checkIfeMailRegex(user.getEmail()))
				&&(validatorService.checkIfFirstNameLastName(user.getFirstName(), user.getLastName()))) {
				System.out.println("Üyeliðiniz baþarýlý bir þekilde güncellenmiþtir...");
				this.userDao.update(user);		
				
			}
			else {
				System.out.println("Ýþlem baþarýsýzdýr, lütfen tekrar deneyiniz");
			}
		
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);;
		System.out.println("Kaydýnýz baþarýlý bir þekilde silinmiþtir...");
		
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
