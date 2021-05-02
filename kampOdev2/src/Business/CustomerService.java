package Business;

import Entity.Customer;

public interface CustomerService {
	void add(Customer customer);
	void delete(Customer customer);
	void update(Customer customer);
	void getAll(Customer[] customers);
}
