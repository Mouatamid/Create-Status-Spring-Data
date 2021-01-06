package org.mouatamid.createstatus.repositories;

import org.mouatamid.createstatus.models.Status;
import org.springframework.data.repository.CrudRepository;

public interface StatusRepository extends CrudRepository<Status, Integer> {
}
