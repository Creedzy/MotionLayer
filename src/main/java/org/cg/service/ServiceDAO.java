package org.cg.service;

import org.cg.service.*;
import org.hibernate.*;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.*;


public abstract class ServiceDAO
 {
    Logger logger = LoggerFactory.getLogger(ServiceDAO.class);
	@Autowired 
	public SessionFactory sessionFactory;
	
	protected Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
	public void deleteById(String table,long id){
		Session session = getCurrentSession();
		try {
		
		Query query = session.createSQLQuery(
		"delete from :table where guid = :guid");
		query.setParameter("table",table);
		query.setParameter("guid",id);
		query.executeUpdate();
		} catch (Exception e) {
		 logger.debug("Error {}",e);
		}
		finally {
			session.close();
		}
	}
	public <T extends Object> T getObject(Class<? extends T> t,long id) {
		Session session = getCurrentSession();
		T entity = null;
		try{
		entity = (T) session.get(t,id);
		session.flush();
		} catch (Exception e)
		{
			logger.debug("Caught error; {}",e);
		}
		return entity;
	}
	
	public void saveObject(Object obj) {
		Session session = getCurrentSession();
		
		try {
			session.save(obj);
		} catch (Exception e) {
			logger.debug("Caught error: {}", e);
		}
		
	}
	
	public void updateObject(Object t,long id){
		Session session = getCurrentSession();
		session.merge(t);
		
	}
	
	public <T extends Object> List<Class<? extends T>> returnList(Class <? extends T> entity ){
		Session session = getCurrentSession();
		List<entity> list = new ArrayList<entity>();
		
		list = (List<entity>) session.createSQLQuery(
				"select * from :entity  ").addEntity(entity).list();
	}
	
}
