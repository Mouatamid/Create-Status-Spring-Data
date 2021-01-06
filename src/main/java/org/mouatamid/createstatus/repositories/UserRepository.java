package org.mouatamid.createstatus.repositories;

import org.mouatamid.createstatus.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);
}
