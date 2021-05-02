package Business;

import Entity.Campaign;
import Entity.Customer;
import Entity.Game;
import Entity.Sales;

public interface SalesService {
	void add(Sales sales,Game game,Customer customer,Campaign campaign);
	void delete(Sales sales);
	void update(Sales sales);
	void getAll(Sales[] sales);
}
