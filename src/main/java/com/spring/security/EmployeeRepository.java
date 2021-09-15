package com.spring.security;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * The Interface EmployeeRepository.
 */
@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
