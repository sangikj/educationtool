package com.kidsducation.services;
import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kidsducation.repository.Customer;
import com.kidsducation.repository.CustomerRepository;

public class CustomerService {
	 @Autowired
	 private CustomerRepository repo;
	 
	 List<Customer> getCustomers();

	  Customer getCustomerById(Long ID);

	  Customer insert(Customer customer);

	  void updateCustomer(Long ID, Customer customer);

	   void deleteCustomer(Long ID);
	 
	    public List<Product> listAll() {
	        return repo.findAll();
	    }
	     
	    public void save(Product product) {
	        repo.save(product);
	    }
	     
	    public Product get(Integer id) {
	        return repo.findById(id).get();
	    }
	     
	    public void delete(Integer id) {
	        repo.deleteById(id);
	    }
}
