package com.myorg.crud.service;

import com.myorg.crud.model.User;
import org.springframework.stereotype.Service;

/**
 *
 * @author Veeresh
 */
@Service
public interface UserService {

    User create(User user) throws Exception;

    User update(User user) throws Exception;

    void delete(User user) throws Exception;

    void delete(Long id) throws Exception;

    User find(Long id) throws Exception;

    Iterable<User> findAll() throws Exception;
}
