package org.cg.service.DAOS;

import java.util.List;

import org.cg.Model.Role;
import org.cg.service.Exception.DataAccessLayerException;
import org.springframework.stereotype.Service;

@Service
public class RoleDAO extends ServiceDAO {

	
	public RoleDAO() {
		super();
	}
	
	 /**
     * Insert a new role into the database.
     * @param event
     */
    public void create(Role role) throws DataAccessLayerException {
        super.saveOrUpdate(role);
    }


    /**
     * Delete a detached role from the database.
     * @param event
     */
    public void delete(Role role) throws DataAccessLayerException {
        super.delete(role);
    }

    /**
     * Find an role by its primary key.
     * @param id
     * @return
     */
    public Role find(Long id) throws DataAccessLayerException {
        return (Role) super.find(Role.class, id);
    }

    /**
     * Updates the state of a detached role.
     *
     * @param event
     */
    public void update(Role role) throws DataAccessLayerException {
        super.saveOrUpdate(role);
    }

    /**
     * Finds all users in the database.
     * @return
     */
    public List findAll() throws DataAccessLayerException{
        return super.findAll(Role.class);
    }
}
