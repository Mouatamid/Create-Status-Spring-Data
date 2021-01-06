package org.mouatamid.createstatus.services;

import org.mouatamid.createstatus.repositories.StatusRepository;
import org.mouatamid.createstatus.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusManipulationService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    StatusRepository statusRepository;
}
