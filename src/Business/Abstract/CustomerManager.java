package Business.Abstract;

import Entities.Concrete.Customer;

public interface CustomerManager  {
	void add(Customer customer) ;
	void delete(Customer customer) ;
	void update(Customer customer) ;
	
}
