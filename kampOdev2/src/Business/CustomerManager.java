package Business;

import Entity.Customer;

public class CustomerManager implements CustomerService {

	@Override
	public void add(Customer customer) {
		System.out.println(customer.getFirstName()+" "+customer.getLastName()+" müşterisi eklendi");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName()+" "+customer.getLastName()+" müşterisi silindi");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName()+" "+customer.getLastName()+" müşterisi güncellendi");
		
	}

	@Override
	public void getAll(Customer[] customers) {
		System.out.println("Müşterilerimiz");
		for(Customer customer:customers) {
			System.out.println(customer.getFirstName()+" "+customer.getLastName());
		}
		
		
	}

	
	

}
