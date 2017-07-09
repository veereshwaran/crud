package com.myorg.crud.controller;

import com.myorg.crud.model.User;
import com.myorg.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author Veeresh
 */
public class UserController {

    @Autowired
    UserService userService;
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public User read(@PathVariable("id") Long id) throws Exception {
        return userService.find(id);
    }
    
    
}
