package org.cg.service.DAOS;


import java.util.List;

import org.cg.Model.Message;
import org.cg.Model.User;
import org.cg.service.Exception.DataAccessLayerException;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.springframework.stereotype.Service;

@Service
public class MessageDAO extends ServiceDAO{

	
	public MessageDAO() {
		super();
	}




	
	 /**
     * Insert a new message into the database.
     * @param event
     */
    public void create(Message message) throws DataAccessLayerException {
        super.saveOrUpdate(message);
    }


    /**
     * Delete a detached message from the database.
     * @param event
     */
    public void delete(Message message) throws DataAccessLayerException {
        super.delete(message);
    }

    /**
     * Find an message by its primary key.
     * @param id
     * @return
     */
    public Message find(Long id) throws DataAccessLayerException {
        return (Message) super.find(Message.class, id);
    }

    /**
     * Updates the state of a detached message.
     *
     * @param event
     */
    public void update(Message message) throws DataAccessLayerException {
        super.saveOrUpdate(message);
    }

    /**
     * Finds all users in the database.
     * @return
     */
    public List findAll() throws DataAccessLayerException{
        return super.findAll(Message.class);
    }
    
    public List findMessagesForUser(String userId) throws DataAccessLayerException{
    	List objects = null;
    	
    	try {
    		session = getCurrentSession();
    		Query query = session.createQuery("from" + Message.class.getName() + "where sender = :userId or receiver = :userId");
    		query.setParameter("userId", userId);
    		 objects = query.list();
	           
        } catch (HibernateException e) {
        	logger.debug("Caught hibernate exception: {}" ,e);
        } 
        return objects;
    }
    
}
