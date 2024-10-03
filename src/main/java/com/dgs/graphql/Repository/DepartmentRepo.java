package com.dgs.graphql.Repository;

import com.dgs.graphql.entity.DepartmentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface DepartmentRepo extends MongoRepository<DepartmentEntity, String> {

    @Query(value = "{_id: {$eq: ?0}}")
    DepartmentEntity findDepartmentById(String departmentId);

    @Query(value = "{departmentName: {$eq: ?0}}")
    DepartmentEntity findByDepartmentName(String departmentName);
}
