package org.cg.service.DAOS;

import java.util.ArrayList;
import java.util.List;

import org.cg.service.*;
import org.hibernate.*;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.*;


public abstract class ServiceDAO
 {
    Logger logger = LoggerFactory.getLogger(ServiceDAO.class);
	@Autowired 
	public SessionFactory sessionFactory;
	Session session;
	protected Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
	 protected void saveOrUpdate(Object obj) {
	        try {
	        	session = getCurrentSession();
	            session.saveOrUpdate(obj);
	          
	        } catch (HibernateException e) {
	            logger.debug("Caught hibernate exception: {}" ,e);
	        } 
	    }

	    protected void delete(Object obj) {
	        try {
	        	session = getCurrentSession();
	            session.delete(obj);
	            
	        } catch (HibernateException e) {
	        	logger.debug("Caught hibernate exception: {}" ,e);
	        } 
	    }

	    protected Object find(Class clazz, Long id) {
	        Object obj = null;
	        try {
	        	session = getCurrentSession();
	            obj = session.load(clazz, id);
	           
	        } catch (HibernateException e) {
	        	logger.debug("Caught hibernate exception: {}" ,e);
	        } 
	        return obj;
	    }

	    protected List findAll(Class clazz) {
	        List objects = null;
	        try {
	        	session = getCurrentSession();
	            Query query = session.createQuery("from " + clazz.getName());
	            objects = query.list();
	           
	        } catch (HibernateException e) {
	        	logger.debug("Caught hibernate exception: {}" ,e);
	        } 
	        return objects;
	    }

	   
	
	
}
