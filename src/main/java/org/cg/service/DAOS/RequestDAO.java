package org.cg.service.DAOS;


import java.util.List;

import org.cg.Model.Request;
import org.cg.Model.dto.RequestDTO;
import org.cg.service.Exception.DataAccessLayerException;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.springframework.stereotype.Service;

@Service
public class RequestDAO extends ServiceDAO{


	public RequestDAO() {
		super();
	}





	/**
     * Insert a new request into the database.
     * @param event
     */
    public void create(Request request) throws DataAccessLayerException {
        super.saveOrUpdate(request);
    }


    /**
     * Delete a detached request from the database.
     * @param event
     */
    public void delete(Request request) throws DataAccessLayerException {
        super.delete(request);
    }

    /**
     * Find an request by its primary key.
     * @param id
     * @return
     */
    public Request find(Long id) throws DataAccessLayerException {
        return (Request) super.find(Request.class, id);
    }

    /**
     * Updates the state of a detached request.
     *
     * @param event
     */
    public void update(Request request) throws DataAccessLayerException {
        super.saveOrUpdate(request);
    }

    /**
     * Finds all users in the database.
     * @return
     */
    public List findAll() throws DataAccessLayerException{
        return super.findAll(Request.class);
    }

    public List findMCForUser(String userId) throws DataAccessLayerException{
    	List objects = null;

    	try {
    		session = getCurrentSession();
    		Query query = session.createQuery("from" + Request.class.getName() + "where owner = :userId");
    		query.setParameter("userId", userId);
			objects = query.list();

        } catch (HibernateException e) {
        	logger.debug("Caught hibernate exception: {}" ,e);
        } 
        return objects;
    }

}
