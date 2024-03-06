package com.employee.emsbackendapplication.service.impl;

import com.employee.emsbackendapplication.dto.EmployeeDto;
import com.employee.emsbackendapplication.entity.Employee;
import com.employee.emsbackendapplication.exception.ResourceNotFoundException;
import com.employee.emsbackendapplication.mapper.EmployeeMapper;
import com.employee.emsbackendapplication.repository.EmployeeRepository;
import com.employee.emsbackendapplication.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
   private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee= EmployeeMapper.mapToEmployee(employeeDto);
        Employee saveEmployee=employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(saveEmployee);

    }

    @Override
    public EmployeeDto getEmployeeById(Long id) {
        Employee employee=employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Resource not found"));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public EmployeeDto updateEmployeeById(EmployeeDto employeeDto,Long id) {

        Employee employee=employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Resource not found"));
//        employee.setId(employeeDto.getId());
        employee.setEmail(employeeDto.getEmail());
        employee.setFirstName(employeeDto.getFirstName());
        employee.setLastName(employeeDto.getLastName());
        Employee employee1=employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(employee1);
    }

    @Override
    public String deleteEmployeeById(Long id) {
          employeeRepository.deleteById(id);
        return "Deleted successfully";
    }

    @Override
    public List<EmployeeDto> getAllEmployee() {
        List<Employee> allEmployee=employeeRepository.findAll();
       List<EmployeeDto>list=allEmployee.stream().map((emp)->EmployeeMapper.mapToEmployeeDto(emp)).collect(Collectors.toList());
        return list;
    }


}
