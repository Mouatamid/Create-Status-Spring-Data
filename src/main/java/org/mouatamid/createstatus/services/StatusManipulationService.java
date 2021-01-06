package org.mouatamid.createstatus.services;

import org.mouatamid.createstatus.models.Status;
import org.mouatamid.createstatus.models.User;
import org.mouatamid.createstatus.repositories.StatusRepository;
import org.mouatamid.createstatus.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StatusManipulationService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    StatusRepository statusRepository;

    //Create status
    @Transactional
    public boolean createStatus(Status status){
        return statusRepository.save(status) != null;
    }
}
