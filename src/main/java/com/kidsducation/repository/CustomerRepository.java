package com.kidsducation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	  List<Customer> getCustomers();

	  Customer getCustomerById(Long ID);

	  Customer insert(Customer customer);

	    void updateCustomer(Long ID, Customer customer);

	    void deleteCustomer(Long ID);
}
