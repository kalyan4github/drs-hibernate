package com.techdenovo.app.drs.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.techdenovo.app.drs.dao.CustomerDAO;
import com.techdenovo.app.drs.daoImpl.CustomerDAOImpl;
import com.techdenovo.app.drs.model.Customer;
import com.techdenovo.app.drs.utility.HiberUtility;

@WebServlet("/AddCustomer")
public class AddCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;     
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		String firstName = request.getParameter("first-name");
		String lastName = request.getParameter("last-name");
		String mobileNo = request.getParameter("mobile-no");
		String emailid = request.getParameter("email-id");
		
		if(!(firstName.isEmpty()) || !(lastName.isEmpty()) || !(mobileNo.isEmpty()) || !(emailid.isEmpty())) {
			Customer customer =  new Customer();
			customer.setFirstName(firstName);
			customer.setLastName(lastName);
			customer.setMobileNo(mobileNo);
			customer.setEmailId(emailid);
			
			CustomerDAO customerDAO = new CustomerDAOImpl();
			Long r=customerDAO.addCustomer(customer);
			System.out.println("r "+r);
			/*
			 * SessionFactory sessionFactory = HiberUtility.getSessionFactory(); Session
			 * session = sessionFactory.openSession(); Transaction tx=
			 * session.beginTransaction(); session.save(customer); session.flush();
			 * tx.commit(); session.close();
			 */
			response.sendRedirect("success.jsp");
		}
		
	}

}
