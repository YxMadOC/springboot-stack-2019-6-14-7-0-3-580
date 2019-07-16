package com.tw.apistackbase.controller;

import com.tw.apistackbase.model.Employee;
import com.tw.apistackbase.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    private EmployeeRepository employeeRepository = new EmployeeRepository();

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee findById(@PathVariable String employeeId) {
        return employeeRepository.findById(employeeId);
    }

    @PostMapping("/employees")
    public Employee create(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @PutMapping("/employees/{employeeId}")
    public Employee update(@PathVariable String employeeId, @RequestBody Employee employee) {
        return employeeRepository.update(employeeId, employee);
    }

    @DeleteMapping("/employees/{employeeId}")
    public Employee delete(@PathVariable String employeeId) {
        return employeeRepository.delete(employeeId);
    }

    @GetMapping("/employees/age/lt/{age}")
    public List<Employee> findByAgeLargerThan(@PathVariable Integer age) {
        return employeeRepository.findByAgeLargerThan(age);
    }


}
