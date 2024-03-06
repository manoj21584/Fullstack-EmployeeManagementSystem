package com.employee.emsbackendapplication.controller;

import com.employee.emsbackendapplication.dto.EmployeeDto;
import com.employee.emsbackendapplication.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/employees")
@AllArgsConstructor
public class EmployeeController {
    private EmployeeService employeeService;
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto employeeDto1=employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(employeeDto1, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable Long id){
        EmployeeDto employeeDto1=employeeService.getEmployeeById(id);
        return new ResponseEntity<>(employeeDto1, HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<EmployeeDto> updateEmployeeById(@RequestBody EmployeeDto employeeDto,@PathVariable Long id){
        EmployeeDto employeeDto1=employeeService.updateEmployeeById(employeeDto,id);
        return new ResponseEntity<>(employeeDto1, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployeeById(@PathVariable Long id){
        String deleteStatus=employeeService.deleteEmployeeById(id);
        return new ResponseEntity<>(deleteStatus, HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getAllEmp(){
        List<EmployeeDto> allEmployee=employeeService.getAllEmployee();
        return new ResponseEntity<>(allEmployee, HttpStatus.OK);
    }


}
