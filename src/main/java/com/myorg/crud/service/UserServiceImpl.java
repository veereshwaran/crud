package com.myorg.crud.service;

import com.myorg.crud.model.User;
import com.myorg.crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Veeresh
 */
public class UserServiceImpl implements UserService {
    
    @Autowired
    UserRepository userRepository;

    @Override
    public User create(User user) throws Exception {
        return userRepository.save(user);
    }

    @Override
    public User update(User user) throws Exception {
        return userRepository.save(user);
    }

    @Override
    public void delete(User user) throws Exception {
        userRepository.delete(user);
    }

    @Override
    public void delete(Long id) throws Exception {
        userRepository.delete(id);
    }

    @Override
    public User find(Long id) throws Exception {
        return userRepository.findOne(id);
    }

    @Override
    public Iterable<User> findAll() throws Exception {
        return userRepository.findAll();
    }
    
}
