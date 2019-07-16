package com.tw.apistackbase.controller;

import com.tw.apistackbase.model.Employee;
import com.tw.apistackbase.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee findById(@PathVariable String employeeId) {
        return employeeService.findById(employeeId);
    }

    @PostMapping("/employees")
    public Employee create(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @PutMapping("/employees/{employeeId}")
    public Employee update(@PathVariable String employeeId, @RequestBody Employee employee) {
        return employeeService.update(employeeId, employee);
    }

    @DeleteMapping("/employees/{employeeId}")
    public Employee delete(@PathVariable String employeeId) {
        return employeeService.delete(employeeId);
    }

    @GetMapping("/employees/lt")
    public List<Employee> findByAgeLargerThan(@RequestParam Integer age) {
        return employeeService.findByAgeLargerThan(age);
    }


}
