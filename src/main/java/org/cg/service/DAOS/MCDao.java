package org.cg.service.DAOS;


import java.util.List;

import org.cg.Model.MotionCapture;
import org.cg.Model.dto.MotionCaptureDTO;
import org.cg.service.Exception.DataAccessLayerException;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.springframework.stereotype.Service;

@Service
public class MCDao extends ServiceDAO{


	public MCDao() {
		super();
	}





	/**
     * Insert a new mc into the database.
     * @param event
     */
    public void create(MotionCapture mc) throws DataAccessLayerException {
        super.saveOrUpdate(mc);
    }


    /**
     * Delete a detached mc from the database.
     * @param event
     */
    public void delete(MotionCapture mc) throws DataAccessLayerException {
        super.delete(mc);
    }

    /**
     * Find an mc by its primary key.
     * @param id
     * @return
     */
    public MotionCapture find(Long id) throws DataAccessLayerException {
        return (MotionCapture) super.find(MotionCapture.class, id);
    }

    /**
     * Updates the state of a detached mc.
     *
     * @param event
     */
    public void update(MotionCapture mc) throws DataAccessLayerException {
        super.saveOrUpdate(mc);
    }

    /**
     * Finds all users in the database.
     * @return
     */
    public List findAll() throws DataAccessLayerException{
        return super.findAll(MotionCapture.class);
    }

    public List findMCForUser(String userId) throws DataAccessLayerException{
    	List objects = null;

    	try {
    		session = getCurrentSession();
    		Query query = session.createQuery("from" + MotionCapture.class.getName() + "where uploader = :userId");
    		query.setParameter("userId", userId);
			objects = query.list();

        } catch (HibernateException e) {
        	logger.debug("Caught hibernate exception: {}" ,e);
        } 
        return objects;
    }

}
