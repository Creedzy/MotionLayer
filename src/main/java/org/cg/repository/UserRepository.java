package org.cg.repository;
import org.cg.Model.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User,Long>
{
	
}
