package com.employee.emsbackendapplication.service;

import com.employee.emsbackendapplication.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long id);
    EmployeeDto updateEmployeeById(EmployeeDto employeeDto,Long id);
    String deleteEmployeeById(Long id);
    List<EmployeeDto> getAllEmployee();


}
