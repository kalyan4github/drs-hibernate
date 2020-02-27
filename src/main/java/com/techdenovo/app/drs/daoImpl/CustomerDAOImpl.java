package com.techdenovo.app.drs.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.techdenovo.app.drs.dao.CustomerDAO;
import com.techdenovo.app.drs.model.Customer;
import com.techdenovo.app.drs.utility.HiberUtility;

public class CustomerDAOImpl implements CustomerDAO {

	//private SessionFactory sessionFactory;
	@Override
	public Long addCustomer(Customer customer) {
		Session session = (Session) HiberUtility.getSessionFactory();
		Long id =(Long) session.save(customer);
		return id;
	}

}
