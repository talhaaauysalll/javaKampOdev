package Business;

import Entity.Campaign;
import Entity.Customer;
import Entity.Game;
import Entity.Sales;

public class SalesManager implements SalesService{

	@Override
	public void add(Sales sales, Game game, Customer customer,Campaign campaign) {
		System.out.println(sales.getId()+"'li siparişe ait olan "+game.getProductName()+" oyunu"+
				customer.getFirstName()+" "+customer.getLastName()+" müşterimize"+campaign.getCampaignName()+" kampanyası ile satılmıştır");
		
	}

	@Override
	public void delete(Sales sales) {
		System.out.println(sales.getId()+" nolu sipariş silinmiştir.");
		
	}

	@Override
	public void update(Sales sales) {
		System.out.println(sales.getId()+" nolu sipariş güncellenmiştir.");

		
	}

	@Override
	public void getAll(Sales[] sales) {
		System.out.println("Yapılan Siparişler");
		for(Sales sale:sales) {
			System.out.println(sale.getId()+" / "+sale.getSalesDate());
		}
		
	}

	

}
