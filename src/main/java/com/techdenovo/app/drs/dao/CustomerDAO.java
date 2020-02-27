package com.techdenovo.app.drs.dao;

import com.techdenovo.app.drs.model.Customer;

public interface CustomerDAO {
	//public List<Customer> getAllCustomers();
	public Long addCustomer(Customer customer);
}
