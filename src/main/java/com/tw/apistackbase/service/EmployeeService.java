package com.tw.apistackbase.service;

import com.tw.apistackbase.model.Employee;
import com.tw.apistackbase.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee findById(String employeeId) {
        return employeeRepository.findById(employeeId);
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee update(String employeeId, Employee employee) {
        return employeeRepository.update(employeeId, employee);
    }

    public Employee delete(String employeeId) {
        return employeeRepository.delete(employeeId);
    }

    public List<Employee> findByAgeLargerThan(Integer age) {
        return employeeRepository.findByAgeLargerThan(age);
    }

}
