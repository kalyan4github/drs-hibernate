package com.techdenovo.app.drs.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.techdenovo.app.drs.dao.CustomerDAO;
import com.techdenovo.app.drs.model.Customer;
import com.techdenovo.app.drs.utility.HiberUtility;

public class CustomerDAOImpl implements CustomerDAO {

	private SessionFactory sessionFactory=HiberUtility.getSessionFactory();
	@Override
	public Long addCustomer(Customer customer) {
		Session session = this.sessionFactory.openSession();
		Transaction tx=  session.beginTransaction();
		Long id =(Long) session.save(customer);
		tx.commit();
		session.close();
		return id;
	}

}
