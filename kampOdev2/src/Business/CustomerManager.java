package Business;

import Entity.Customer;

public class CustomerManager implements CustomerService {

	@Override
	public void add(Customer customer) {
		System.out.println(customer.getFirstName()+" "+customer.getLastName()+" müþterisi eklendi");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName()+" "+customer.getLastName()+" müþterisi silindi");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName()+" "+customer.getLastName()+" müþterisi güncellendi");
		
	}

	@Override
	public void getAll(Customer[] customers) {
		System.out.println("Müþterilerimiz");
		for(Customer customer:customers) {
			System.out.println(customer.getFirstName()+" "+customer.getLastName());
		}
		
		
	}

	
	

}
