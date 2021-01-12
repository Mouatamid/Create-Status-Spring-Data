package org.mouatamid.createstatus.services;

import org.mouatamid.createstatus.models.Status;
import org.mouatamid.createstatus.models.User;
import org.mouatamid.createstatus.repositories.StatusRepository;
import org.mouatamid.createstatus.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

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
    //Find status
    @Transactional
    public Status findStatus(Integer id){
        Optional<Status> optionalStatus  = statusRepository.findById(id);
        return optionalStatus.isEmpty() ? null : optionalStatus.get();
    }
    //Update status
    @Transactional
    public boolean updateStatus(Status status){
        return statusRepository.save(status) != null;
    }
}
