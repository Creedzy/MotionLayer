package org.cg.service.DAOS;

import java.util.List;

import org.cg.Model.User;
import org.cg.service.Exception.DataAccessLayerException;
import org.springframework.stereotype.Service;

@Service
public class UserDAO extends ServiceDAO{

	public UserDAO() {
		super();
	}
	
	 /**
     * Insert a new user into the database.
     * @param event
     */
    public void create(User user) throws DataAccessLayerException {
        super.saveOrUpdate(user);
    }


    /**
     * Delete a detached user from the database.
     * @param event
     */
    public void delete(User user) throws DataAccessLayerException {
        super.delete(user);
    }

    /**
     * Find an user by its primary key.
     * @param id
     * @return
     */
    public User find(Long id) throws DataAccessLayerException {
        return (User) super.find(User.class, id);
    }

    /**
     * Updates the state of a detached user.
     *
     * @param event
     */
    public void update(User user) throws DataAccessLayerException {
        super.saveOrUpdate(user);
    }

    /**
     * Finds all users in the database.
     * @return
     */
    public List findAll() throws DataAccessLayerException{
        return super.findAll(User.class);
    }
}
