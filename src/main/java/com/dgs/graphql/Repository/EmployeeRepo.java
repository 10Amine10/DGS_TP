package com.dgs.graphql.Repository;

import com.dgs.graphql.entity.EmployeeEntity;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface EmployeeRepo extends MongoRepository<EmployeeEntity, String> {

    @Query(value = "{_id:  {$eq:  ?0 }}")
    EmployeeEntity findEmployeeById(ObjectId employeeId);
}
