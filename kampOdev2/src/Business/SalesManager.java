package Business;

import Entity.Campaign;
import Entity.Customer;
import Entity.Game;
import Entity.Sales;

public class SalesManager implements SalesService{

	@Override
	public void add(Sales sales, Game game, Customer customer,Campaign campaign) {
		System.out.println(sales.getId()+"'li sipariþe ait olan "+game.getProductName()+" oyunu"+
				customer.getFirstName()+" "+customer.getLastName()+" müþterimize"+campaign.getCampaignName()+" kampanyasý ile satýlmýþtýr");
		
	}

	@Override
	public void delete(Sales sales) {
		System.out.println(sales.getId()+" nolu sipariþ silinmiþtir.");
		
	}

	@Override
	public void update(Sales sales) {
		System.out.println(sales.getId()+" nolu sipariþ güncellenmiþtir.");

		
	}

	@Override
	public void getAll(Sales[] sales) {
		System.out.println("Yapýlan Sipariþler");
		for(Sales sale:sales) {
			System.out.println(sale.getId()+" / "+sale.getSalesDate());
		}
		
	}

	

}
