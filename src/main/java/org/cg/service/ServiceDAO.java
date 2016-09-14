package org.cg.service;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.*;


public abstract class ServiceDAO
 {

	@Autowired 
	public SessionFactory sessionFactory;
	
	protected Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
	
	
}
