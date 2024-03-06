package com.employee.emsbackendapplication.repository;

import com.employee.emsbackendapplication.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
