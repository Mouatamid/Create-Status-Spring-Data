package org.mouatamid.createstatus.services;

import org.mouatamid.createstatus.models.User;
import org.mouatamid.createstatus.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    //Create an account
    @Transactional
    public boolean createUser(User newUser){
        if (userRepository.findByUsername(newUser.getUsername()) != null){
            return false;
        }
        return userRepository.save(newUser) != null;
    }
    //Login
    @Transactional
    public boolean loginUser(String userName, String password){
        User userToLoginIn = userRepository.findByUsername(userName);
        return userToLoginIn != null ? userToLoginIn.getPassword().equals(password) : false;
    }
}
