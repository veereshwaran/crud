package com.myorg.crud.repository;

import com.myorg.crud.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Veeresh
 */
public interface UserRepository extends CrudRepository<User, Long> {
    
}
