package com.Spring.ExternalService.Repository;

import com.Spring.ExternalService.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
