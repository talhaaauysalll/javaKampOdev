package Business;

import Entity.Campaign;
import Entity.Customer;
import Entity.Game;
import Entity.Sales;
import Entity.User;

public class Main {

	public static void main(String[] args) {
		User user=new User();
		user.setId(1);
		user.setNationalityIdentity("11111111111");
		user.setFirstName("Talha");
		user.setLastName("UYSAL");
		user.setEmail("talha@talha.com");
		user.setPassword("12345");
		user.setDateOfBirth("23.08.1998");
		
		Customer customer=new Customer();
		customer.setId(1);
		customer.setUserId(10);
		customer.setFirstName("Talha");
		customer.setLastName("UYSAL");
		
		UserManager userManager=new UserManager(new EDevletAuthentication());
		userManager.register(user);
		userManager.login(user);
		
		Game game=new Game();
		game.setId(1);
		game.setProductName("Gta V");
		game.setGameCategoryId(1);
		game.setUnitPrice(500);
		game.setUnitsInStock(5);
		
		Game game1=new Game();
		game1.setId(2);
		game1.setProductName("Gta Vice City");
		game1.setGameCategoryId(1);
		game1.setUnitPrice(50);
		game1.setUnitsInStock(1);
		Game[] games= {game,game1};
		
		GameManager gameManager=new GameManager();
		gameManager.add(game);
		gameManager.add(game1);
		gameManager.getAll(games);
		
		Campaign campaign=new Campaign();
		campaign.setId(1);
		campaign.setCampaignName("Bir alana bir bedava kampanyasý");
		campaign.setCampaignValidityDate("30.06.2021");
		
		Campaign[] campaigns= {campaign};
		
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.getAll(campaigns);
		
		Sales sales=new Sales();
		sales.setId(1);
		sales.setCustomerId(1);
		sales.setSalesDate("03.05.2021");
		Sales[] saleses= {sales};
		
		SalesManager salesManager=new SalesManager();
		salesManager.add(sales, game1, customer, campaign);
		salesManager.getAll(saleses);

	}

}
